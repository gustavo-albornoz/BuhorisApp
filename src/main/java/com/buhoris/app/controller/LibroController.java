package com.buhoris.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// LibroController.java
@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public ResponseEntity<List<LibroDTO>> getAllLibros() {
        return ResponseEntity.ok(libroService.findAll());
    }

    @PostMapping
    public ResponseEntity<LibroDTO> createLibro(@Valid @RequestBody LibroDTO libroDTO) {
        return new ResponseEntity<>(libroService.save(libroDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroDTO> getLibroById(@PathVariable Long id) {
        return ResponseEntity.ok(libroService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibroDTO> updateLibro(@PathVariable Long id, @Valid @RequestBody LibroDTO libroDTO) {
        return ResponseEntity.ok(libroService.update(id, libroDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibro(@PathVariable Long id) {
        libroService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/disponibles")
    public ResponseEntity<List<LibroDTO>> getLibrosDisponibles() {
        return ResponseEntity.ok(libroService.findDisponibles());
    }

    @GetMapping("/{id}/digital")
    public ResponseEntity<Resource> getLibroDigital(@PathVariable Long id) {
        // Lógica para descargar el PDF
    }

    @PostMapping("/{id}/digital")
    public ResponseEntity<Void> uploadLibroDigital(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        // Lógica para subir el PDF
    }
}