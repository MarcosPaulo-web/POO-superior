package com.superior.poo.controller;


import com.superior.poo.dto.FuncionarioDto;
import com.superior.poo.model.ClienteModel;
import com.superior.poo.model.FuncionarioModel;
import com.superior.poo.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    @PostMapping
    public ResponseEntity<FuncionarioModel> save(@RequestBody @Valid FuncionarioDto funcionarioDto) {
        var funcionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, funcionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioRepository.save(funcionarioModel));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioRepository.findAll());
    }

    @GetMapping("{cdFuncionario}")
    public ResponseEntity<Object> findFuncionarioByCd(@PathVariable("cdFuncionario") Integer cdFuncionario) {
        Optional<FuncionarioModel> funcionario0 = funcionarioRepository.findByCdFuncionario(cdFuncionario);

        if (funcionario0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(funcionario0.get());
    }
}
