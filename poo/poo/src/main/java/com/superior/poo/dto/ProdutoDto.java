package com.superior.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// O DTO (Data Transfer Object) é usado para transportar dados entre
// as camadas do sistema, sem expor a entidade/model diretamente.
public record ProdutoDto(

        // Valida que o nome do produto não pode ser nulo ou em branco
        @NotBlank(message = "")
        String nmProduto,

        // Descrição do produto (opcional, sem validação)
        String dsProduto,

        // Valida que o valor do produto não pode ser nulo
        @NotNull(message = "Não é possivel cadastrar produto com o campo vazio")
        // Valida que o valor mínimo do produto deve ser 0.01
        @DecimalMin(value = "0.01", message = "Não é possivel cadastrar um produto com valor abaixo de 0.01")
        double vlProduto,

        // Valida que a flag não pode ser nula
        @NotNull(message = "Não é possivel cadastrar o produto com uma flag vazia")
        // Valida que a flag não pode estar em branco
        @NotBlank(message = "Não é possivel cadastrar com a fleg em branco")
        String flativo

) {
    // Como é um 'record', não precisa de construtor ou getters/setters.
    // O Java cria automaticamente um construtor e os métodos de acesso.
}
