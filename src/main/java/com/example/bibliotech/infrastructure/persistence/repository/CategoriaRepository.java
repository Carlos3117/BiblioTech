package com.example.bibliotech.infrastructure.persistence.repository;

import com.example.bibliotech.core.domain.Categoria;
import com.example.bibliotech.core.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
