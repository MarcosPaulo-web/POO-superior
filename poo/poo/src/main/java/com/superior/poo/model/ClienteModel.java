package com.superior.poo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "TBCLIENTE")
public class ClienteModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDCLIENTE")
    private int cdCliente;

    @Column(name = "NMCLIENTE")
    private String nmCliente;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "IDADE")
    private Integer idade;

    @Column(name = "ALTURA")
    private Integer altura;
}
