package com.buhoris.app.service;

import com.buhoris.app.DTO.LibroDTO;
import com.buhoris.app.repository.GeneroRepository;
import com.buhoris.app.repository.LibroRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

// LibroService.java
@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Transactional
    public LibroDTO save(LibroDTO libroDTO) {
        // Implementación para guardar un libro
        LibroDTO libro = new LibroDTO();

        return libro;

    }

    @Transactional(readOnly = true)
    public List<LibroDTO> findAll() {
        // Implementación para obtener todos los libros

        List<LibroDTO> libros = new ArrayList<>();

        return libros;
    }

    @Transactional(readOnly = true)
    public LibroDTO findById(Long id) {
        // Implementación para obtener un libro por ID
        LibroDTO libro = new LibroDTO();

        return libro;

    }

    @Transactional
    public LibroDTO update(Long id, @Valid LibroDTO libroDTO) {
        // Implementación para actualizar un libro
        LibroDTO libro = new LibroDTO();

        return libro;
    }

    @Transactional
    public void delete(Long id) {
        // Implementación para borrado lógico
    }

    @Transactional(readOnly = true)
    public List<LibroDTO> findDisponibles() {
        // Implementación para obtener libros disponibles
        List<LibroDTO> libros = new ArrayList<>();

        return libros;
    }
}