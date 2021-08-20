package com.github.cdominguess.cidadesapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cidade {
    @Id
    private Long id;

    @Column
    private String nome;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private Estado estado;

    @Column(name = "ibge")
    private Integer codigoIbge;

    @Column(name = "lat_lon")
    private String latitudeLongitude;

    @Column
    private Double latitude;

    @Column
    private Double longitude;
}