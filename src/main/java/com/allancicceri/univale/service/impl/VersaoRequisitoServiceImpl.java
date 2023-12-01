package com.allancicceri.univale.service.impl;

import com.allancicceri.univale.model.entity.VersaoRequisito;
import com.allancicceri.univale.model.repository.VersaoRequisitoRepository;
import com.allancicceri.univale.service.VersaoRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VersaoRequisitoServiceImpl implements VersaoRequisitoService {
    @Autowired
    VersaoRequisitoRepository repositoryVersao;

    @Override
    public VersaoRequisito create(VersaoRequisito versaoRequisito) {

        return repositoryVersao.save(versaoRequisito);
    }

    @Override
    public VersaoRequisito Update(int id, VersaoRequisito versaoRequisito) {
        return null;
    }

    @Override
    public VersaoRequisito FindById(int id) {
        return null;
    }

    @Override
    public List<VersaoRequisito> FindAll() {
        return null;
    }

    @Override
    public void Delete(int id) {

    }
}
