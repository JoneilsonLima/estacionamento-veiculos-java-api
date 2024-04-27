package com.mballem.demoparkapi.web.dto;

import com.mballem.demoparkapi.entity.Usuario;

public record UsuarioResponseDto(
        Long id,
        String username,
        String role
) {
    public UsuarioResponseDto(Usuario usuario, String role) {
        this(usuario.getId(), usuario.getUsername(), role);
    }
}
