package com.generation.retrogame.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.retrogame.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
