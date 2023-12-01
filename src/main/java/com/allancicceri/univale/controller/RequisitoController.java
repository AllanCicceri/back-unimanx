package com.allancicceri.univale.controller;

import com.allancicceri.univale.model.entity.Requisito;
import com.allancicceri.univale.service.RequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requisitos")
public class RequisitoController {
    @Autowired
    private RequisitoService service;
    @GetMapping
    public ResponseEntity<List<Requisito>> GetAll(){
        List<Requisito> requisitos = service.FindAll();
        return  ResponseEntity.ok(requisitos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Requisito> GetById(@PathVariable int id){
        Requisito requisito = service.FindById(id);
        return  ResponseEntity.ok(requisito);
    }

    @PostMapping
    public ResponseEntity<Requisito> Create(@RequestBody Requisito requisito){
        var result = service.create(requisito);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Requisito> Update(@PathVariable int id, @RequestBody Requisito requisito){
        var result = service.Update(id, requisito);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable int id){

        service.Delete(id);
    }


    @GetMapping("/projeto/{projetoId}")
    public ResponseEntity<List<Requisito>> getRequisitosPorProjeto(@PathVariable int projetoId) {
        List<Requisito> requisitos = service.buscarPorProjeto(projetoId);
        return ResponseEntity.ok(requisitos);
    }


}
