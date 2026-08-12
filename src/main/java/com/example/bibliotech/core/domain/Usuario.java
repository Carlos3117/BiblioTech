package com.example.bibliotech.core.domain;

import com.example.bibliotech.core.domain.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Usuario {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false ,length = 40)
    private String name;

    @Column(unique = true, nullable = false, length = 40)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoUsuario userType;

    @Column(nullable = false)
    private Boolean active;

}
