package com.mballem.demoparkapi.web.dto.mapper;

import com.mballem.demoparkapi.entity.Usuario;
import com.mballem.demoparkapi.web.dto.UsuarioCreateDto;
import com.mballem.demoparkapi.web.dto.UsuarioResponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.BeanUtils;

public class UsuarioMapper {
    public static Usuario toUsuario(UsuarioCreateDto createDto) {
        Usuario user = new Usuario();
        BeanUtils.copyProperties(createDto, user);
        return user;
    }

    public static UsuarioResponseDto toDto(Usuario usuario) {
        String role = usuario.getRole().name().substring("ROLE_".length());
        return new UsuarioResponseDto(usuario, role);
    }
}
