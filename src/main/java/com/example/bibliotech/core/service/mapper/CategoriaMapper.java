package com.example.bibliotech.core.service.mapper;

import com.example.bibliotech.core.domain.Categoria;
import com.example.bibliotech.infrastructure.web.dtos.CategoriaDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    Categoria toEntity(CategoriaDto.CrearRequest request);

    CategoriaDto.Response toResponse(Categoria categoria);

    void updateEntity(
            CategoriaDto.ActualizarRequest request,
            @MappingTarget Categoria categoria
    );
}