package com.nirma.clienteservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirma.clienteservice.entity.Cliente;
import com.nirma.clienteservice.model.Cuenta;
import com.nirma.clienteservice.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> getAll(){
		List<Cliente> clientes=clienteService.getAll();
		if (clientes==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(clientes);
		
	}
	@PostMapping
	public ResponseEntity<Cliente> save (@RequestBody Cliente cliente){
		Cliente miCliente=clienteService.save(cliente);
		
		if(miCliente==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(miCliente);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getById(@PathVariable("id")  int id) {
		Cliente cliente=clienteService.getById(id);
		if (cliente==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(cliente);
		
	}
	
	@PostMapping("/cuenta/")
	public ResponseEntity<Cuenta> saveCuentaCliente(Cuenta cuenta){
		Cuenta nuevaCuenta=clienteService.saveCuenta(cuenta);
		if(nuevaCuenta==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(nuevaCuenta);
	}
	
	@GetMapping("/cuenta/{idCliente}")
	private ResponseEntity<List<Cuenta>> cuentasPorCliente(@PathVariable("idCliente") int idCliente){
		List<Cuenta> cuentas=clienteService.findCuentasXcliente(idCliente);
		
		if(cuentas==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(cuentas);
	}
}
