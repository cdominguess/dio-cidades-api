package com.github.cdominguess.cidadesapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pais {
    @Id
    private Long id;

    @Column
    private String nome;

    @Column(name = "nome_pt")
    private String nomePtBR;

    @Column
    private String sigla;

    private Integer bacen;
}