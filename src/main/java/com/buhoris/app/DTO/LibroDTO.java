package com.buhoris.app.DTO;

import java.time.LocalDate;
import java.util.Set;

// LibroDTO.java
public class LibroDTO {
    private Long idLibro;
    private String titulo;
    private String autor;
    private String descripcion;
    private LocalDate fechaPublicacion;
    private String editorial;
    private String idioma;
    private Boolean disponible;
    private Boolean tieneDigital;
    private Set<String> generos;

    // Getters, setters
}