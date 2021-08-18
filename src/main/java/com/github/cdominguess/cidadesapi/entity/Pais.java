package com.github.cdominguess.cidadesapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pais")
@Entity(name = "Pais")
public class Pais {
    @Id
    private Long id;

    @Column
    private String nome;

    @Column
    private String nome_pt;

    @Column
    private String sigla;

    private Integer bacen;
}