package com.github.cdominguess.cidadesapi.service;

import com.github.cdominguess.cidadesapi.entity.Cidade;
import com.github.cdominguess.cidadesapi.exception.MensagemGenerica;
import com.github.cdominguess.cidadesapi.repository.CidadeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
@Service
public class CidadeService {
    private CidadeRepository cidadeRepository;

    public Page<Cidade> listar(Pageable pagina) {
        return cidadeRepository.findAll(pagina);
    }

    public ResponseEntity buscarPorId(Long id) {
        try {
            Optional<Cidade> objCidade = cidadeRepository.findById(id);
            return new ResponseEntity(objCidade.get(), HttpStatus.OK);
        } catch (Exception ex) {
            MensagemGenerica objMsg = new MensagemGenerica(HttpStatus.NOT_FOUND.value(), "Cidade com ID " + id + " não encontrado.");
            return new ResponseEntity(objMsg, HttpStatus.NOT_FOUND);
        }
    }
}
