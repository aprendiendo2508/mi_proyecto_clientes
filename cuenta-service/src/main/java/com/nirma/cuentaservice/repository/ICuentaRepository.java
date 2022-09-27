package com.nirma.cuentaservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirma.cuentaservice.entity.Cuenta;

public interface ICuentaRepository extends JpaRepository<Cuenta, Integer> {
	List<Cuenta> findByIdCliente(int idCliente);
}
