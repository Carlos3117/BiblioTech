package com.example.bibliotech.core.service.mapper;

import com.example.bibliotech.core.domain.Categoria;
import com.example.bibliotech.core.domain.Libro;
import com.example.bibliotech.infrastructure.web.dtos.LibroDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface LibroMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "category", source = "category")
    Libro toEntity(
            LibroDto.CrearRequest request,
            Categoria category
    );

    @Mapping(target = "categoryId", source = "category.id")
    LibroDto.Response toResponse(Libro libro);

    @Mapping(target = "category", source = "category")
    void updateEntity(
            LibroDto.ActualizarRequest request,
            Categoria category,
            @MappingTarget Libro libro
    );
}