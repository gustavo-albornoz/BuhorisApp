package com.buhoris.app.service;

import org.springframework.stereotype.Service;

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
    public PrestamoDTO createPrestamo(PrestamoRequestDTO prestamoRequest) {
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
