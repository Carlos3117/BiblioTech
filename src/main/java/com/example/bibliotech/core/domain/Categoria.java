package com.example.bibliotech.core.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true,length = 20)
    private String name;

    @Column(nullable = false, length = 100)
    private String description;

    @OneToMany(mappedBy = "category" , fetch = FetchType.LAZY )
    private List<Libro> books = new ArrayList<>();
}
