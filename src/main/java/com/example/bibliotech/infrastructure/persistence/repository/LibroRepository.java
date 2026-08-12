package com.example.bibliotech.infrastructure.persistence.repository;

import com.example.bibliotech.core.domain.Libro;
import com.example.bibliotech.core.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository  extends JpaRepository<Libro, Long> {
}
