package com.example.bibliotech.infrastructure.web.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CategoriaDto {

    public record CrearRequest(

            @NotBlank
            @Size(max = 50)
            String name,

            @NotBlank
            @Size(max = 100)
            String description

    ) {
    }

    public record ActualizarRequest(

            @NotBlank
            @Size(max = 50)
            String name,

            @NotBlank
            @Size(max = 100)
            String description

    ) {
    }

    public record Response(
            Long id,
            String name,
            String description
    ) {
    }
}
