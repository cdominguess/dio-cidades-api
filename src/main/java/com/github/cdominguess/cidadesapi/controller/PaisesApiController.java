package com.github.cdominguess.cidadesapi.controller;

import com.github.cdominguess.cidadesapi.entity.Pais;
import com.github.cdominguess.cidadesapi.service.PaisService;
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
@RequestMapping("/api/v1/paises")
public class PaisesApiController {
    private PaisService paisService;

    @GetMapping("/")
    public Page<Pais> listar(Pageable pagina) {
        return paisService.listar(pagina);
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id) {
        return paisService.buscarPorId(id);
    }
}
