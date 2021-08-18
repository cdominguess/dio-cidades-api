package com.github.cdominguess.cidadesapi.controller;

import com.github.cdominguess.cidadesapi.entity.Pais;
import com.github.cdominguess.cidadesapi.service.PaisService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/api/v1")
public class PaisesApiController {

    private PaisService paisService;

    @GetMapping("/")
    public ResponseEntity index() {
        return new ResponseEntity("API PAISES funcionando", HttpStatus.OK);
    }

    @GetMapping("/paises")
    public List<Pais> listarPaises() {
        return paisService.listarPaises();
    }
}
