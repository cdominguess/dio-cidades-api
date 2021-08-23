package com.github.cdominguess.cidadesapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@TypeDefs(value = { @TypeDef(name = "point", typeClass = PointType.class )})
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
    private String geoLocation;

    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    @Column
    private Double latitude;

    @Column
    private Double longitude;
}