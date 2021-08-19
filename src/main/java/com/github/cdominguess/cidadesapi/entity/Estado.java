package com.github.cdominguess.cidadesapi.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class Estado {

    @Id
    private Long id;

    @Column
    private String nome;

    @Column
    private String uf;

//    @Column(name = "pais")
//    private Integer idPais;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Pais pais;

//    @Column(name = "ddd")
//    private String ddd;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;
}
