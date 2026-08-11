package com.example.bibliotech.core.domain;

import jakarta.persistence.*;
import lombok.*;

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


}
