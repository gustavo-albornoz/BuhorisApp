package com.buhoris.app.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "USUARIO")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String email;

    @Enumerated(EnumType.STRING)
    private RolUsuario rol;

    private Boolean activo = true;

    @OneToMany(mappedBy = "usuario")
    private List<Prestamo> prestamos;

    // Getters, setters, constructores

    public Usuario(Long idUsuario, String nombre, String apellido, String dni, LocalDate fechaNacimiento, String direccion, String email, RolUsuario rol, Boolean activo, List<Prestamo> prestamos) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.email = email;
        this.rol = rol;
        this.activo = activo;
        this.prestamos = prestamos;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public Boolean getActivo() {
        return activo;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }


}

