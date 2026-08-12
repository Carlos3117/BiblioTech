package com.example.bibliotech.core.service.mapper;

import com.example.bibliotech.core.domain.Libro;
import com.example.bibliotech.core.domain.Reserva;
import com.example.bibliotech.core.domain.Usuario;
import com.example.bibliotech.infrastructure.web.dtos.ReservaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReservaMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", source = "user")
    @Mapping(target = "book", source = "book")
    @Mapping(target = "reservationDate", ignore = true)
    @Mapping(target = "expirationDate", ignore = true)
    @Mapping(target = "status", ignore = true)
    Reserva toEntity(
            ReservaDto.CrearRequest request,
            Usuario user,
            Libro book
    );

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "bookId", source = "book.id")
    ReservaDto.Response toResponse(Reserva reserva);
}