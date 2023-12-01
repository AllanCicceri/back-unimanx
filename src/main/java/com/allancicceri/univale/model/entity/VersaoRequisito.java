package com.allancicceri.univale.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "versoes_requisito")
public class VersaoRequisito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int versao;
    private String nome;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "requisito_id")
    private Requisito requisito;
}
