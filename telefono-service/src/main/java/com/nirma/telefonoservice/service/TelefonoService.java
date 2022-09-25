package com.nirma.telefonoservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirma.telefonoservice.entity.Telefono;
import com.nirma.telefonoservice.repository.ITelefonoRepository;

@Service
public class TelefonoService {
	
	@Autowired
	private ITelefonoRepository telefonoRepository;
	
	public List<Telefono> getAll(){
		return telefonoRepository.findAll();
	}
	
	public Telefono save(Telefono telefono) {
		return telefonoRepository.save(telefono);
	}
	
	public Telefono getById(int idTelefono) {
		return telefonoRepository.findById(idTelefono).orElse(null);
	}
}
