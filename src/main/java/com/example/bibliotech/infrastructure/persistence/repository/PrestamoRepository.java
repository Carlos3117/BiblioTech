package com.example.bibliotech.infrastructure.persistence.repository;

import com.example.bibliotech.core.domain.Prestamo;
import com.example.bibliotech.core.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository  extends JpaRepository<Prestamo, Long> {
}
