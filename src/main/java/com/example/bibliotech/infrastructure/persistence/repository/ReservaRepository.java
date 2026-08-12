package com.example.bibliotech.infrastructure.persistence.repository;

import com.example.bibliotech.core.domain.Reserva;
import com.example.bibliotech.core.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository  extends JpaRepository<Reserva, Long> {
}
