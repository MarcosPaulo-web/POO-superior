package com.superior.poo.repository;

import com.superior.poo.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {

    Optional<FuncionarioModel> findAllByCdFuncionario(int cdFuncionario);

    Optional<FuncionarioModel> findByCdFuncionario(int cdFuncionario);



}
