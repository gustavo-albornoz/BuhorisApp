package com.buhoris.app.service;

import org.springframework.stereotype.Service;

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
    public LibroDTO update(Long id, LibroDTO libroDTO) {
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