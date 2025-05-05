package com.buhoris.app.model;

import jakarta.persistence.*;

import java.time.LocalDate;

// Prestamo.java
@Entity
@Table(name = "PRESTAMO")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrestamo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro libro;

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionEsperada;
    private LocalDate fechaDevolucionEfectiva;

    @Enumerated(EnumType.STRING)
    private EstadoPrestamo estado;

    private Boolean activo = true;

    // Getters, setters, constructores
}

