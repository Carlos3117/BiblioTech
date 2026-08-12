package com.example.bibliotech.core.domain;

import com.example.bibliotech.core.domain.enums.EstadoReserva;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate reservationDate;

    @Column(nullable = false)
    private LocalDate expirationDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoReserva status;

    @ManyToOne
    @JoinColumn(name = "user_id" , nullable = false)
    private Usuario user;

    @ManyToOne
    @JoinColumn(name = "libro_id", nullable = false)
    private Libro book;

}
