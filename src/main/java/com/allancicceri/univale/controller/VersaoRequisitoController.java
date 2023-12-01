package com.allancicceri.univale.controller;

import com.allancicceri.univale.model.entity.Requisito;
import com.allancicceri.univale.model.entity.VersaoRequisito;
import com.allancicceri.univale.service.VersaoRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versao_requisito")
public class VersaoRequisitoController {
    @Autowired
    VersaoRequisitoService service;

    @PostMapping
    public ResponseEntity<VersaoRequisito> Create(@RequestBody VersaoRequisito requisito){
        var result = service.create(requisito);
        return ResponseEntity.ok(result);
    }
}
