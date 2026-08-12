package com.example.bibliotech.core.service.mapper;

import com.example.bibliotech.core.domain.Usuario;
import com.example.bibliotech.infrastructure.web.dtos.UsuarioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "active", constant = "true")
    Usuario toEntity(UsuarioDto.CrearRequest request);

    UsuarioDto.Response toResponse(Usuario usuario);
}