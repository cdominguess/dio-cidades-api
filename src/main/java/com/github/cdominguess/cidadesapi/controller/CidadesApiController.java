package com.github.cdominguess.cidadesapi.controller;

import com.github.cdominguess.cidadesapi.entity.Cidade;
import com.github.cdominguess.cidadesapi.service.CidadeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/api/v1/cidades")
public class CidadesApiController {
    private CidadeService cidadeService;

    @GetMapping("/")
    public Page<Cidade> listar(Pageable pagina) {
        return cidadeService.listar(pagina);
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id) {
        return cidadeService.buscarPorId(id);
    }
}
