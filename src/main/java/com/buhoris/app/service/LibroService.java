package com.buhoris.app.service;

import com.buhoris.app.DTO.LibroDTO;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

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
    }

    @Transactional(readOnly = true)
    public List<LibroDTO> findAll() {
        // Implementación para obtener todos los libros
    }

    @Transactional(readOnly = true)
    public LibroDTO findById(Long id) {
        // Implementación para obtener un libro por ID
    }

    @Transactional
    public LibroDTO update(Long id, @Valid LibroDTO libroDTO) {
        // Implementación para actualizar un libro
    }

    @Transactional
    public void delete(Long id) {
        // Implementación para borrado lógico
    }

    @Transactional(readOnly = true)
    public List<LibroDTO> findDisponibles() {
        // Implementación para obtener libros disponibles
    }
}