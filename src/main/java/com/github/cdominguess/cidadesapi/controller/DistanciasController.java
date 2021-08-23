package com.github.cdominguess.cidadesapi.controller;

import com.github.cdominguess.cidadesapi.service.DistanciaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
@RestController
@RequestMapping("/api/v1/distancias")
public class DistanciasController {
    private DistanciaService service;

    @GetMapping("/porPontos")
    public Double porPontos(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2) {
        return service.distanciaPorPontosEmMilhas(city1, city2);
    }

    @GetMapping("/porCubo")
    public Double porCubo(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        return service.distanciaPorCuboEmMetros(city1, city2);
    }
}