package com.allancicceri.univale.model.repository;

import com.allancicceri.univale.model.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
}
