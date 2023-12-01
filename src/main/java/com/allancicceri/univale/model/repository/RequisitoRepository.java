package com.allancicceri.univale.model.repository;

import com.allancicceri.univale.model.entity.Requisito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequisitoRepository extends JpaRepository<Requisito, Integer> {
    List<Requisito> findByProjetoId(int projetoId);
}
