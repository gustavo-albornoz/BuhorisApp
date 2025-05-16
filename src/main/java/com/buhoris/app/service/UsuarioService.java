package com.buhoris.app.service;

import com.buhoris.app.DTO.PrestamoDTO;
import com.buhoris.app.DTO.UsuarioDTO;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    public List<UsuarioDTO> findAll() {

        List<UsuarioDTO> usuarios = new ArrayList<>();

    return usuarios;

    }

    public UsuarioDTO save(@Valid UsuarioDTO usuarioDTO) {

        UsuarioDTO usuario = new UsuarioDTO();

        return usuario;
    }

    public UsuarioDTO findById(Long id) {

        UsuarioDTO usuario = new UsuarioDTO();

        return usuario;

    }

    public UsuarioDTO update(Long id, @Valid UsuarioDTO usuarioDTO) {

        UsuarioDTO usuario = new UsuarioDTO();

        return usuario;

    }

    public void delete(Long id) {
    }

    public List<PrestamoDTO> findPrestamosByUsuario(Long id) {

        List<PrestamoDTO> prestamos = new ArrayList<>();

        return prestamos;

    }
}
