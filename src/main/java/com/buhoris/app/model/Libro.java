package com.buhoris.app.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Libro.java
@Entity
@Table(name = "LIBRO")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    private String titulo;
    private String autor;
    private String descripcion;
    private LocalDate fechaPublicacion;
    private String editorial;
    private String idioma;
    private Boolean disponible = true;
    private Boolean tieneDigital = false;
    private String rutaArchivoDigital; // Para almacenar la ruta del PDF

    @ManyToMany
    @JoinTable(
            name = "LIBRO_GENERO",
            joinColumns = @JoinColumn(name = "id_libro"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private Set<Genero> generos = new HashSet<>();

    @OneToMany(mappedBy = "libro")
    private List<Prestamo> prestamos;

    // Getters, setters, constructores
}