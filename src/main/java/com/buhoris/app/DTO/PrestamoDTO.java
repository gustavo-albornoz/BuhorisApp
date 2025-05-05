package com.buhoris.app.DTO;

import java.time.LocalDate;

// PrestamoDTO.java
public class PrestamoDTO {
    private Long idPrestamo;
    private Long idUsuario;
    private Long idLibro;
    private String tituloLibro;
    private String nombreUsuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionEsperada;
    private LocalDate fechaDevolucionEfectiva;
    private String estado;

    // Getters, setters
}