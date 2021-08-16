package com.github.cdominguess.cidadesapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cidade")
public class CidadesApiController {

    @GetMapping("/")
    public ResponseEntity index() {
        return new ResponseEntity("API funcionando", HttpStatus.OK);
    }
}
