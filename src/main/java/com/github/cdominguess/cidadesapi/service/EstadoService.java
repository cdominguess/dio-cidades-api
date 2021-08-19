package com.github.cdominguess.cidadesapi.service;

import com.github.cdominguess.cidadesapi.entity.Estado;
import com.github.cdominguess.cidadesapi.exception.MensagemGenerica;
import com.github.cdominguess.cidadesapi.repository.EstadoRepository;
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
public class EstadoService {
    private EstadoRepository estadoRepository;

    public Page<Estado> listar(Pageable pagina) {
        return estadoRepository.findAll(pagina);
    }

    public ResponseEntity buscarPorId(Long id) {
        try {
            Optional<Estado> objEstado = estadoRepository.findById(id);
            return new ResponseEntity(objEstado.get(), HttpStatus.OK);
        } catch (Exception ex) {
            MensagemGenerica objMsg = new MensagemGenerica(HttpStatus.NOT_FOUND.value(), "Estado com ID " + id + " não encontrado.");
            return new ResponseEntity(objMsg, HttpStatus.NOT_FOUND);
        }
    }
}
