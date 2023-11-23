package com.allancicceri.univale.service.impl;

import com.allancicceri.univale.model.entity.Usuario;
import com.allancicceri.univale.model.repository.UsuarioRepository;
import com.allancicceri.univale.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Usuario Update(int id, Usuario usuario) {
        return null;
    }

    @Override
    public Usuario FindById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Usuario FindByNome(String nome) {
        return repository.findByNome(nome);
    }

    @Override
    public List<Usuario> FindAll() {
        return repository.findAll();
    }

    @Override
    public void Delete(int id) {

    }
}
