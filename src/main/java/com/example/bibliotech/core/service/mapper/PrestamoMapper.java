package com.example.bibliotech.core.service.mapper;

import com.example.bibliotech.core.domain.Libro;
import com.example.bibliotech.core.domain.Prestamo;
import com.example.bibliotech.core.domain.Usuario;
import com.example.bibliotech.infrastructure.web.dtos.PrestamoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrestamoMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", source = "user")
    @Mapping(target = "book", source = "book")
    @Mapping(target = "checkoutDate", ignore = true)
    @Mapping(target = "expirationDate", ignore = true)
    @Mapping(target = "returnDate", ignore = true)
    @Mapping(target = "status", ignore = true)
    Prestamo toEntity(
            PrestamoDto.CrearRequest request,
            Usuario user,
            Libro book
    );

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "bookId", source = "book.id")
    PrestamoDto.Response toResponse(Prestamo prestamo);
}