package com.example.creditos.controller;

import com.example.creditos.model.SolicitudCredito;
import com.example.creditos.repository.SolicitudCreditoRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudCreditoController {

    private final SolicitudCreditoRepository repository;

    public SolicitudCreditoController(SolicitudCreditoRepository repository) {
        this.repository = repository;
    }

    // Obtener todas las solicitudes
    @GetMapping
    public List<SolicitudCredito> listarSolicitudes() {
        return repository.findAll();
    }

    // Crear una nueva solicitud
    @PostMapping
    public ResponseEntity<SolicitudCredito> crearSolicitud(@Valid @RequestBody SolicitudCredito solicitud) {
        return ResponseEntity.ok(repository.save(solicitud));
    }
}