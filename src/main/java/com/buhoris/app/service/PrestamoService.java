package com.buhoris.app.service;

import com.buhoris.app.DTO.PrestamoRequestDTO;
import com.buhoris.app.repository.LibroRepository;
import com.buhoris.app.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

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
    }

    @Transactional
    public PrestamoDTO registrarDevolucion(Long idPrestamo) {
        // Registrar la devolución y actualizar estado
    }

    @Transactional(readOnly = true)
    public List<PrestamoDTO> findPrestamosVencidos() {
        // Obtener préstamos con estado vencido
    }

    @Transactional(readOnly = true)
    public ReportePrestamosDTO generarReportePrestamos(LocalDate fechaInicio, LocalDate fechaFin) {
        // Generar reporte con estadísticas de préstamos
    }
}
