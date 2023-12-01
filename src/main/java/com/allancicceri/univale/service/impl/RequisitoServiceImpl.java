package com.allancicceri.univale.service.impl;

import com.allancicceri.univale.model.entity.Projeto;
import com.allancicceri.univale.model.entity.Requisito;
import com.allancicceri.univale.model.entity.VersaoRequisito;
import com.allancicceri.univale.model.repository.ProjetoRepository;
import com.allancicceri.univale.model.repository.RequisitoRepository;
import com.allancicceri.univale.model.repository.VersaoRequisitoRepository;
import com.allancicceri.univale.service.RequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequisitoServiceImpl implements RequisitoService {
    @Autowired
    private RequisitoRepository requisitoRepository;
    @Autowired
    private ProjetoRepository projetoRepository;
    @Autowired
    private VersaoRequisitoRepository versaoRequisitoRepository;

    @Override
    public Requisito create(Requisito requisito) {
        Projeto projeto = projetoRepository.findById(requisito.getProjeto().getId()).orElse(null);

        if (projeto != null) {
            requisito.setProjeto(projeto);
            return requisitoRepository.save(requisito);
        } else {
            return null;
        }
    }

    @Override
    public Requisito Update(int id, Requisito requisito) {
        Requisito requisitoAntigo = requisitoRepository.findById(id).get();
        VersaoRequisito versaoRequisito = new VersaoRequisito();
        versaoRequisito.setRequisito(requisitoAntigo);


        return requisitoRepository.save(requisito);
    }

    @Override
    public Requisito FindById(int id) {
        return null;
    }

    @Override
    public List<Requisito> FindAll() {
        return null;
    }

    @Override
    public void Delete(int id) {
        requisitoRepository.deleteById(id);
    }

    @Override
    public List<Requisito> buscarPorProjeto(int id) {
        return requisitoRepository.findByProjetoId(id);
    }
}
