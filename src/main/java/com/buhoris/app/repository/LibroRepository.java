package com.buhoris.app.repository;

import com.buhoris.app.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// LibroRepository.java
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByDisponibleTrue();
    List<Libro> findByTituloContainingIgnoreCase(String titulo);
    List<Libro> findByAutorContainingIgnoreCase(String autor);
    List<Libro> findByGeneros_Nombre(String nombreGenero);
}