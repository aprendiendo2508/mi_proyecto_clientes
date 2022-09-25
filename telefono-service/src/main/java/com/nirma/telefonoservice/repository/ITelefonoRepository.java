package com.nirma.telefonoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirma.telefonoservice.entity.Telefono;

public interface ITelefonoRepository extends JpaRepository<Telefono, Integer> {

}
