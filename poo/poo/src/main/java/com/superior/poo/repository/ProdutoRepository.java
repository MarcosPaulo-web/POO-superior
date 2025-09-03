package com.superior.poo.repository;

import com.superior.poo.dto.ProdutoDto;
import com.superior.poo.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Marca essa interface como um repositório do Spring, ou seja,
// responsável por acessar o banco de dados (camada de persistência).
//É a parte do sistema responsável por salvar, buscar, atualizar e excluir dados no banco de dados.
@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {

    // Busca um produto pelo código (cdProduto).
    // Retorna Optional, pois pode existir ou não um produto com esse código.
    Optional<ProdutoModel> findByCdProduto(int cdProduto);

    // Busca um produto pelo nome (nmProduto).
    // Também retorna Optional, pois pode não encontrar nada.
    Optional<ProdutoModel> findByNmProduto(String nmProduto);

    // Busca todos os produtos que possuem o código informado.
    // Aqui o correto é retornar uma lista, porque podem existir vários registros.
    Optional<ProdutoModel> findAllByCdProduto(int cdProduto);

}
