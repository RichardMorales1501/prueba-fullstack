package com.example.creditos.model;

import jakarta.persistence.*;

@Entity
public class SolicitudCredito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private Double monto;
    private String estado;

    // Getters y Setters
}