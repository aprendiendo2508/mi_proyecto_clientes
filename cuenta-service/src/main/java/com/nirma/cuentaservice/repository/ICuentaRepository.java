package com.nirma.cuentaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirma.cuentaservice.entity.Cuenta;

public interface ICuentaRepository extends JpaRepository<Cuenta, Integer> {

}
