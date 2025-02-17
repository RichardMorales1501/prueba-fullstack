Prueba Técnica – Full Stack Developer Senior
Objetivo:
Desarrollar un sistema de gestión de solicitudes de crédito, donde los usuarios
puedan:
✅ Crear una nueva solicitud con información básica.
✅ Consultar el estado de sus solicitudes.
✅ Actualizar una solicitud.
✅ Eliminar una solicitud.
El sistema debe estar compuesto por:
● Backend: API en Spring Boot con endpoints REST.
● Base de Datos: PostgreSQL para almacenar solicitudes.
● Frontend: Aplicación en Angular que consuma los endpoints.
Requisitos Técnicos:
Backend - Spring Boot (Java 17)
✅ Implementar una API REST con Spring Boot para la gestión de solicitudes.
✅ Utilizar Spring Data JPA para la integración con PostgreSQL.
✅ Implementar validaciones en los endpoints.
✅ Utilizar JWT para autenticación.
Endpoints requeridos:
● POST /solicitudes → Crear una nueva solicitud de crédito.
● GET /solicitudes/{id} → Obtener los detalles de una solicitud específica.
● PUT /solicitudes/{id} → Actualizar una solicitud.
● DELETE /solicitudes/{id} → Eliminar una solicitud.
● GET /solicitudes → Listar todas las solicitudes.
Base de Datos - PostgreSQL
✅ Crear una base de datos con la tabla de solicitudes.
✅ Usar Spring Data JPA para interactuar con PostgreSQL.
✅ Asegurar que los datos sean persistentes correctamente.
Frontend - Angular (v16+)
✅ Crear una Single Page Application (SPA) con Angular.
✅ Implementar módulos y componentes bien organizados.
✅ Consumir la API REST usando HttpClient.
✅ Crear un formulario reactivo para enviar nuevas solicitudes.
✅ Mostrar una tabla de solicitudes con opciones de editar y eliminar.

Criterios de Evaluación
● Backend:
○ Correcta estructura en Spring Boot.
○ Implementación de validaciones y manejo de errores.
○ Uso adecuado de Spring Data JPA.
○ Implementación de JWT (opcional, puntos extra).
● Base de Datos:
○ Uso correcto de PostgreSQL y Spring Data.
○ Estructura eficiente en la base de datos.
○ Consulta de datos optimizada.
● Frontend:
○ Arquitectura bien organizada en Angular.
○ Uso correcto de HttpClient para consumir la API.
○ Implementación de formularios reactivos.
○ UI limpia con Bootstrap o Material UI.
● Extras (Puntos Bonus):
○ Manejo de estado global con NgRx o Signals.
○ Implementación de paginación y filtros en la tabla de solicitudes.
○ Uso de Docker para levantar el backend y base de datos.

Entrega y Tiempo Estimado
Tiempo estimado: 6 - 8 horas (flexible).
Entrega:

1. Repositorio en GitHub con instrucciones en un README.md.
2. Archivo postman_collection.json con pruebas de API (opcional).
3. Capturas o video mostrando la funcionalidad si no logra completarlo al
   100%.

¡Buena suerte!
