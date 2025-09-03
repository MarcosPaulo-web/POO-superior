package com.superior.poo.controller;

import com.superior.poo.dto.ProdutoDto;
import com.superior.poo.model.ProdutoModel;
import com.superior.poo.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Permite gerar resposta em html
@CrossOrigin(origins = "*")//permite acesso de qualquer origem
@RequestMapping("/api/v1/produto")//define o caminho para todos
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

     @PostMapping
    public ResponseEntity<ProdutoModel> CriarProduto(@Valid @RequestBody ProdutoDto produtoDto){
        var produtoModel = new ProdutoModel();
         BeanUtils.copyProperties(produtoDto,produtoModel);
         return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produtoModel));
     }

     @GetMapping
    public ResponseEntity<List<ProdutoModel>> ListarProdutos(){
         return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
     }
}
