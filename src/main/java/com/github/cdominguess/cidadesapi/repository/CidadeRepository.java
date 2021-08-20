package com.github.cdominguess.cidadesapi.repository;

import com.github.cdominguess.cidadesapi.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
