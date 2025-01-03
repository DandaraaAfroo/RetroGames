package com.generation.retrogame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.retrogame.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
