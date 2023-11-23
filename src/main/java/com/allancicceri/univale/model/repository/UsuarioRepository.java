package com.allancicceri.univale.model.repository;

import com.allancicceri.univale.model.entity.Projeto;
import com.allancicceri.univale.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNome(String nome);

}
