package com.superior.poo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//MODEL : O arquivo serve como um espelho da tabela do banco
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity // fala que ele é uma entidade no banco de dados (Tabela)
@Table(name = "TBPRODUTO")//para nomear a tabela
public class ProdutoModel {

    @Id//OBRIGATÓRIO, define o campo como PK (Chave orimaria)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Define o valor da chave PK, gerado automaticamente pelo banco (serial)
    @Column(name = "CDPRODUTO")//nome da coluna, renomeando a var
    private int cdProduto;

    @Column(name = "NMPRODUTO")
    private String nmProduto;
    @Column(name = "DSPRODUTO")
    private String dsProduto;
    @Column(name = "VLPRODUTO")
    private double vlProduto;
    @Column(name = "FLATIVO")
    private String flativo;


}
