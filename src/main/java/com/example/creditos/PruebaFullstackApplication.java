package com.example.creditos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.laudex.prueba_fullstack", "com.example.creditos.controller"})
public class PruebaFullstackApplication {
    public static void main(String[] args) {
        SpringApplication.run(PruebaFullstackApplication.class, args);
    }
}