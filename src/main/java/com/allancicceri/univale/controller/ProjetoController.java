package com.allancicceri.univale.controller;

import com.allancicceri.univale.model.entity.Projeto;
import com.allancicceri.univale.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService service;

    @GetMapping
    public ResponseEntity<List<Projeto>> GetAll(){
        List<Projeto> projetos = service.FindAll();
        return ResponseEntity.ok(projetos);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Projeto> GetById(@PathVariable int id){
        Projeto projeto = service.FindById(id);
        return  ResponseEntity.ok(projeto);
    }

    @PostMapping
    public ResponseEntity<Projeto> Create(@RequestBody Projeto projeto){
        var result = service.create(projeto);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Projeto> Update(@PathVariable int id, @RequestBody Projeto projeto){
        var result = service.Update(id, projeto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable int id){
        service.Delete(id);
    }
}
