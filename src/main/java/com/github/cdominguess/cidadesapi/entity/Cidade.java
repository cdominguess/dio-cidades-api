package com.github.cdominguess.cidadesapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cidade")
@Entity
public class Cidade {
    @Id
    private Long id;

    @Column
    private String nome;

    @Column(name = "uf")
    private Integer idUf;

    //private
}