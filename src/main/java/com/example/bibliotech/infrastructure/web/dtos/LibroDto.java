package com.example.bibliotech.infrastructure.web.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LibroDto {

    public record CrearRequest(

            @NotBlank
            @Size(max = 50)
            String title,

            @NotBlank
            @Size(max = 50)
            String author,

            @NotBlank
            @Size(max = 13)
            String isbn,

            @NotNull
            @Min(0)
            Integer stock,

            @NotNull
            Long categoryId

    ) {
    }

    public record ActualizarRequest(

            @NotBlank
            @Size(max = 50)
            String title,

            @NotBlank
            @Size(max = 50)
            String author,

            @NotBlank
            @Size(max = 13)
            String isbn,

            @NotNull
            @Min(0)
            Integer stock,

            @NotNull
            Long categoryId

    ) {
    }

    public record Response(
            Long id,
            String title,
            String author,
            String isbn,
            Integer stock,
            Long categoryId
    ) {
    }
}
