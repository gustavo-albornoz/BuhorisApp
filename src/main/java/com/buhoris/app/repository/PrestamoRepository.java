package com.buhoris.app.repository;

import com.buhoris.app.model.EstadoPrestamo;
import com.buhoris.app.model.Prestamo;
import com.buhoris.app.model.RolUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

// PrestamoRepository.java
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    List<Prestamo> findByUsuarioIdAndActivoTrue(Long usuarioId);
    List<Prestamo> findByEstadoAndActivoTrue(EstadoPrestamo estado);
    List<Prestamo> findByFechaDevolucionEsperadaBeforeAndEstado(LocalDate fecha, EstadoPrestamo estado);
    @Query("SELECT p FROM Prestamo p WHERE p.usuario.rol = :rol AND p.fechaPrestamo BETWEEN :fechaInicio AND :fechaFin")
    List<Prestamo> findByRolUsuarioAndFechaPrestamoBetween(
            @Param("rol") RolUsuario rol,
            @Param("fechaInicio") LocalDate fechaInicio,
            @Param("fechaFin") LocalDate fechaFin);
}