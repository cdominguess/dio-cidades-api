package com.github.cdominguess.cidadesapi.service;

import com.github.cdominguess.cidadesapi.entity.Pais;
import com.github.cdominguess.cidadesapi.repository.PaisRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PaisService {
    private PaisRepository paisRepository;

    public List<Pais> listarPaises() {
        return paisRepository.findAll();
    }
}
