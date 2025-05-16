package com.buhoris.app.service;

import com.buhoris.app.DTO.PrestamoDTO;
import com.buhoris.app.DTO.PrestamoRequestDTO;
import com.buhoris.app.DTO.ReportePrestamosDTO;
import com.buhoris.app.repository.LibroRepository;
import com.buhoris.app.repository.PrestamoRepository;
import com.buhoris.app.repository.UsuarioRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// PrestamoService.java
@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public PrestamoDTO createPrestamo(@Valid PrestamoRequestDTO prestamoRequest) {
        // Validar que el usuario no tenga préstamos vencidos
        // Validar que el libro esté disponible
        // Crear el préstamo con fecha de devolución esperada (14 días por defecto)
        PrestamoDTO prestamo = new PrestamoDTO();

        return prestamo;
    }

    @Transactional
    public PrestamoDTO registrarDevolucion(Long idPrestamo) {
        // Registrar la devolución y actualizar estado
        PrestamoDTO prestamo = new PrestamoDTO();

        return prestamo;
    }

    @Transactional(readOnly = true)
    public List<PrestamoDTO> findPrestamosVencidos() {
        // Obtener préstamos con estado vencido
        List<PrestamoDTO> prestamo = new ArrayList<>();

        return prestamo;
    }

    @Transactional(readOnly = true)
    public ReportePrestamosDTO generarReportePrestamos(LocalDate fechaInicio, LocalDate fechaFin) {
        // Generar reporte con estadísticas de préstamos
        ReportePrestamosDTO prestamoReporte = new ReportePrestamosDTO();

        return prestamoReporte;
    }
}
