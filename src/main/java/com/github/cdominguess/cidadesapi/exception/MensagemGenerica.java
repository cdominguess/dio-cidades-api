package com.github.cdominguess.cidadesapi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MensagemGenerica {
    private Integer httpStatus;
    private String mensagem;
}
