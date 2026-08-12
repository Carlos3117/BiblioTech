package com.example.bibliotech.core.domain;

import com.example.bibliotech.core.domain.enums.EstadoMulta;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "multa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Multa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private LocalDate generationDate;

    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoMulta status;

    @OneToOne
    @JoinColumn(name = "prestamo_id", nullable = false, unique = true)
    private Prestamo loan;
}
