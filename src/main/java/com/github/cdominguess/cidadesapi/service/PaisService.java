package com.github.cdominguess.cidadesapi.service;

import com.github.cdominguess.cidadesapi.entity.Pais;
import com.github.cdominguess.cidadesapi.exception.MensagemGenerica;
import com.github.cdominguess.cidadesapi.repository.PaisRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PaisService {
    private PaisRepository paisRepository;

    public Page<Pais> listarPaises(Pageable pagina) {
        return paisRepository.findAll(pagina);
    }

    public ResponseEntity buscarPaisPorId(Long id) {
        try {
            Optional<Pais> objPais = paisRepository.findById(id);
            return new ResponseEntity<Pais>(objPais.get(), HttpStatus.OK);
        } catch (Exception ex) {
            MensagemGenerica objMsg = new MensagemGenerica(HttpStatus.NOT_FOUND.value(), "País com ID " + id + " não encontrado.");
            return new ResponseEntity(objMsg, HttpStatus.NOT_FOUND);
        }
    }
}
