package com.nirma.clienteservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirma.clienteservice.entity.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
