package com.github.cdominguess.cidadesapi.controller;

import com.github.cdominguess.cidadesapi.entity.Estado;
import com.github.cdominguess.cidadesapi.service.EstadoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/api/v1")
public class EstadosApiController {
    private EstadoService estadoService;

    @GetMapping("/estados")
    public Page<Estado> listar(Pageable pagina) {
        return estadoService.listar(pagina);
    }

    @GetMapping("/estados/{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id) {
        return estadoService.buscarPorId(id);
    }
}
