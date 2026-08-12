package com.example.bibliotech.infrastructure.web.dtos;

import com.example.bibliotech.core.domain.enums.EstadoReserva;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class ReservaDto {

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

            LocalDate reservationDate,

            LocalDate expirationDate,

            EstadoReserva status

    ) {
    }
}
