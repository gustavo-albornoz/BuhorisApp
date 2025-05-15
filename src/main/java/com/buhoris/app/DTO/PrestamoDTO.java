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

    public Long getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Long idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    public void setFechaDevolucionEsperada(LocalDate fechaDevolucionEsperada) {
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    public LocalDate getFechaDevolucionEfectiva() {
        return fechaDevolucionEfectiva;
    }

    public void setFechaDevolucionEfectiva(LocalDate fechaDevolucionEfectiva) {
        this.fechaDevolucionEfectiva = fechaDevolucionEfectiva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}