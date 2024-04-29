package com.mballem.demoparkapi.web.dto;

public record UsuarioSenhaDto(
        String senhaAtual,
        String novaSenha,
        String confirmaSenha
) {
}
