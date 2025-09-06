package com.superior.poo.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record ClienteDto(

        @NotBlank(message = "O nome do cliente não pode ser nulo")
        String nmCliente,

        @NotBlank(message = "O numero do cliente não pode ser vazio")
        String telefone,

        @NotNull(message = "A idade do cliente não pode está vazia")
        Integer idade,

        @NotNull(message = "A altura do cliente não pode estar vazia")
        Integer altura

) {
}
