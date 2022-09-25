package com.nirma.cuentaservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirma.cuentaservice.entity.Cuenta;
import com.nirma.cuentaservice.repository.ICuentaRepository;

@Service
public class CuentaService {
	
	@Autowired
	private ICuentaRepository cuentaRepository;
	
	public List<Cuenta> getAll(){
		return cuentaRepository.findAll();
	}
	public Cuenta getById(int id) {
		return cuentaRepository.findById(id).orElse(null);
	}
	public Cuenta save(Cuenta cuenta) {
		return cuentaRepository.save(cuenta);
	}
}
