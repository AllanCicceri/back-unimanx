package com.allancicceri.univale.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "requisitos")
public class Requisito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private String tipo; //funcional/não_funcional
    private int versao;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;
}
