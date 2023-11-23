package com.allancicceri.univale.service;

import com.allancicceri.univale.model.entity.Projeto;
import com.allancicceri.univale.model.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario create(Usuario usuario);
    Usuario Update(int id, Usuario usuario);
    Usuario FindById(int id);
    Usuario FindByNome(String nome);
    List<Usuario> FindAll();
    void Delete(int id);
}
