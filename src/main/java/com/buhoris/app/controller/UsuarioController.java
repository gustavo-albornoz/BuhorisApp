package com.buhoris.app.controller;

import com.buhoris.app.DTO.PrestamoDTO;
import com.buhoris.app.DTO.UsuarioDTO;
import com.buhoris.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// UsuarioController.java
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> createUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
        return new ResponseEntity<>(usuarioService.save(usuarioDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getUsuarioById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> updateUsuario(@PathVariable Long id, @Valid @RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(usuarioService.update(id, usuarioDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/prestamos")
    public ResponseEntity<List<PrestamoDTO>> getPrestamosByUsuario(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findPrestamosByUsuario(id));
    }
}