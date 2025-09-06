package com.superior.poo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBFUNCIONARIO")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cdFuncionario;

    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionario;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "salario")
    private Double salario;

}
