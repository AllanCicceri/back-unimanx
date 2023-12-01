package com.allancicceri.univale.service;

import com.allancicceri.univale.model.entity.Requisito;
import java.util.List;

public interface RequisitoService {
    Requisito create(Requisito requisito);
    Requisito Update(int id, Requisito requisito);
    Requisito FindById(int id);
    List<Requisito> FindAll();
    void Delete(int id);

    List<Requisito> buscarPorProjeto(int id);
}
