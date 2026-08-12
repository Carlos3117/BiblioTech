package com.example.bibliotech.core.domain;

import com.example.bibliotech.core.domain.enums.EstadoPrestamo;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prestamo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate checkoutDate;

    @Column(nullable = false)
    private LocalDate expirationDate;

    private LocalDate returnDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoPrestamo status;

    @ManyToOne
    @JoinColumn(name = "user_id" , nullable = false)
    private Usuario user;

    @ManyToOne
    @JoinColumn(name = "libro_id" , nullable = false)
    private Libro book;

}
