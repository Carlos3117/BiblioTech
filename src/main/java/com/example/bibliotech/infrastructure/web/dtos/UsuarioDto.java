package com.example.bibliotech.infrastructure.web.dtos;

import com.example.bibliotech.core.domain.enums.TipoUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioDto {

    public record CrearRequest(

            @NotBlank
            @Size(max = 40)
            String name,

            @NotBlank
            @Email
            @Size(max = 40)
            String email,

            @NotNull
            TipoUsuario userType

    ) {
    }

    public record ActualizarRequest(

            @NotBlank
            @Size(max = 40)
            String name,

            @NotBlank
            @Email
            @Size(max = 40)
            String email,

            @NotNull
            TipoUsuario userType

    ) {
    }

    public record Response(
            Long id,
            String name,
            String email,
            TipoUsuario userType,
            Boolean active
    ) {
    }
}