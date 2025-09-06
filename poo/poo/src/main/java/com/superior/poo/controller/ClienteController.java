package com.superior.poo.controller;


import com.superior.poo.dto.ClienteDto;
import com.superior.poo.dto.ProdutoDto;
import com.superior.poo.model.ClienteModel;
import com.superior.poo.repository.ClienteRepository;
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
@RequestMapping("/api/v1/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<ClienteModel>save(@RequestBody@Valid ClienteDto clienteDto){

        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteDto,clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));

    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>>findAllClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }

    @GetMapping("{cdCliente}")
    public  ResponseEntity<Object>findFuncionarioByCd(@PathVariable("cdCliente")Integer cdCliente){

        Optional<ClienteModel>cliente0 = clienteRepository.findByCdCliente(cdCliente);
        if (cliente0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi encontrado um cliente");
        }
        return  ResponseEntity.status(HttpStatus.OK).body(cliente0.get());

    }
}
