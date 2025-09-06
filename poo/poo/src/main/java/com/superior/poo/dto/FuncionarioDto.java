package com.superior.poo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto(

        @NotBlank(message = "O nome do funcionario não pode ser vazio")
        String nmFuncionario,

        @NotNull(message = "O telefone do funcionario não pode ser vazio")
        String telefone,

        @NotNull(message = "O salario não pode ser vazio")
        Double salario

) {
}
