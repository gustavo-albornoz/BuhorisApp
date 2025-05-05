package com.buhoris.app.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

// Genero.java
@Entity
@Table(name = "GENERO")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;

    private String nombre;
    private String descripcion;

    @ManyToMany(mappedBy = "generos")
    private Set<Libro> libros = new HashSet<>();

    // Getters, setters, constructores
}