package com.github.cdominguess.cidadesapi.service;

import com.github.cdominguess.cidadesapi.entity.Cidade;
import com.github.cdominguess.cidadesapi.repository.CidadeRepository;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
@Service
public class DistanciaService {
    private CidadeRepository cidadeRepository;

    /**
     * @param cidade1
     * @param cidade2
     * @return
     */
    public Double distanciaPorPontosEmMilhas(final Long cidade1, final Long cidade2) {
        return cidadeRepository.distanciaPorPontos(cidade1, cidade2);
    }

    /**
     * @param cidade1
     * @param cidade2
     * @return
     */
    public Double distanciaPorCuboEmMetros(Long cidade1, Long cidade2) {
        final List<Cidade> cidades = cidadeRepository.findAllById((Arrays.asList(cidade1, cidade2)));

        Point p1 = cidades.get(0).getLocation();
        Point p2 = cidades.get(1).getLocation();

        return cidadeRepository.distanciaPorCubo(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
