package com.example.creditos.controller;

import com.example.creditos.model.SolicitudCredito;
import com.example.creditos.repository.SolicitudCreditoRepository;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/solicitudes")
public class SolicitudCreditoController {

    private final SolicitudCreditoRepository repository;

    public SolicitudCreditoController(SolicitudCreditoRepository repository) {
        this.repository = repository;
    }

    // POST /solicitudes → Crear una nueva solicitud de crédito.
    @PostMapping
    public ResponseEntity<SolicitudCredito> crearSolicitud(@Valid @RequestBody SolicitudCredito solicitud) {
        SolicitudCredito nuevaSolicitud = repository.save(solicitud);
        return ResponseEntity.ok(nuevaSolicitud);
    }

    // GET /solicitudes/{id} → Obtener los detalles de una solicitud específica.
    @GetMapping("/{id}")
    public ResponseEntity<SolicitudCredito> obtenerSolicitud(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // PUT /solicitudes/{id} → Actualizar una solicitud.
    @PutMapping("/{id}")
    public ResponseEntity<SolicitudCredito> actualizarSolicitud(@PathVariable Long id,
                                                                  @Valid @RequestBody SolicitudCredito solicitudActualizada) {
        return repository.findById(id)
                .map(solicitud -> {
                    solicitud.setNombre(solicitudActualizada.getNombre());
                    solicitud.setEmail(solicitudActualizada.getEmail());
                    solicitud.setMonto(solicitudActualizada.getMonto());
                    solicitud.setEstado(solicitudActualizada.getEstado());
                    return ResponseEntity.ok(repository.save(solicitud));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE /solicitudes/{id} → Eliminar una solicitud.
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarSolicitud(@PathVariable Long id) {
        Optional<SolicitudCredito> solicitudOptional = repository.findById(id);
        if (solicitudOptional.isPresent()) {
            repository.delete(solicitudOptional.get());
            return ResponseEntity.noContent().build();
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    // GET /solicitudes → Listar todas las solicitudes.
    @GetMapping
    public List<SolicitudCredito> listarSolicitudes() {
        return repository.findAll();
    }
}