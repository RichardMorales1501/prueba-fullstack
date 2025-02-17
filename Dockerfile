# Usamos una imagen de OpenJDK 17
FROM eclipse-temurin:17-jdk

# Creamos un directorio de trabajo
WORKDIR /app

# Copiamos todo el contenido del repo a /app
COPY . /app

# Damos permisos de ejecución al wrapper de Maven (opcional)
RUN chmod +x mvnw

# Construimos la aplicación
RUN ./mvnw clean install

# Exponemos el puerto 8080 (por defecto)
EXPOSE 8080

# Ejecutamos la aplicación
CMD ["java", "-jar", "target/prueba_fullstack-0.0.1-SNAPSHOT.jar"]