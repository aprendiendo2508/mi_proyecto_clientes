package com.nirma.telefonoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirma.telefonoservice.entity.Telefono;
import com.nirma.telefonoservice.service.TelefonoService;



@RestController
@RequestMapping("/telefono")
public class TelefonoController {
	
	@Autowired
	private TelefonoService telefonoService;
	
	@PostMapping
	public ResponseEntity<Telefono> save(@RequestBody Telefono telefono) {
		Telefono miTelefono=telefonoService.save(telefono);
		if(miTelefono==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(miTelefono);
	}
	
	@GetMapping
	public ResponseEntity<List<Telefono>> getAll(){
		List<Telefono> telefonos=telefonoService.getAll();
		if (telefonos==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(telefonos);
	}
	
	@GetMapping("/{idTelefono}")
	public ResponseEntity<Telefono> getById(@PathVariable("idTelefono") int idTelefono){
		Telefono telefono=telefonoService.getById(idTelefono);
		
		if (telefono==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(telefono);
	}
}
