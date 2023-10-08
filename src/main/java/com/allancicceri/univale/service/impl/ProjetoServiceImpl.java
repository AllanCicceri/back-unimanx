package com.allancicceri.univale.service.impl;

import com.allancicceri.univale.model.entity.Projeto;
import com.allancicceri.univale.model.repository.ProjetoRepository;
import com.allancicceri.univale.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoServiceImpl implements ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    @Override
    public Projeto create(Projeto projeto) {
        return  projetoRepository.save(projeto);
    }

    @Override
    public Projeto Update(int id, Projeto projeto) {
        Projeto projeto1 = projetoRepository.findById(id).get();
        projeto1.setNome(projeto.getNome());
        projeto1.setDescricao(projeto.getDescricao());
        return projetoRepository.save(projeto1);
    }

    @Override
    public Projeto FindById(int id) {
        return projetoRepository.findById(id).get();
    }

    @Override
    public List<Projeto> FindAll() {
        return projetoRepository.findAll();
    }

    @Override
    public void Delete(int id) {
        Projeto projeto = projetoRepository.findById(id).get();
        projetoRepository.delete(projeto);
    }
}
