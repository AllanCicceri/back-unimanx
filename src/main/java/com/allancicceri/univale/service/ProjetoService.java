package com.allancicceri.univale.service;

import com.allancicceri.univale.model.entity.Projeto;

import java.util.List;

public interface ProjetoService {
    Projeto create(Projeto projeto);
    Projeto Update(int id, Projeto projeto);
    Projeto FindById(int id);
    List<Projeto> FindAll();
    void Delete(int id);
}
