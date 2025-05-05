package com.buhoris.app.controller;

import com.buhoris.app.DTO.PrestamoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// PrestamoController.java
@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @PostMapping
    public ResponseEntity<PrestamoDTO> createPrestamo(@Valid @RequestBody PrestamoRequestDTO prestamoRequest) {
        return new ResponseEntity<>(prestamoService.createPrestamo(prestamoRequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}/devolucion")
    public ResponseEntity<PrestamoDTO> registrarDevolucion(@PathVariable Long id) {
        return ResponseEntity.ok(prestamoService.registrarDevolucion(id));
    }

    @GetMapping("/vencidos")
    public ResponseEntity<List<PrestamoDTO>> getPrestamosVencidos() {
        return ResponseEntity.ok(prestamoService.findPrestamosVencidos());
    }

    @GetMapping("/reporte")
    public ResponseEntity<ReportePrestamosDTO> getReportePrestamos(
            @RequestParam(required = false) LocalDate fechaInicio,
            @RequestParam(required = false) LocalDate fechaFin) {
        return ResponseEntity.ok(prestamoService.generarReportePrestamos(fechaInicio, fechaFin));
    }
}