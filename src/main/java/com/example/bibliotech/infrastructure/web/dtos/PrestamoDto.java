package com.example.bibliotech.infrastructure.web.dtos;

import com.example.bibliotech.core.domain.enums.EstadoPrestamo;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class PrestamoDto {

    public record CrearRequest(

            @NotNull
            Long userId,

            @NotNull
            Long bookId

    ) {
    }

    public record Response(

            Long id,

            Long userId,

            Long bookId,

            LocalDate checkoutDate,

            LocalDate expirationDate,

            LocalDate returnDate,

            EstadoPrestamo status

    ) {
    }
}
