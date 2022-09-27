package com.nirma.cuentaservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirma.cuentaservice.entity.Cuenta;
import com.nirma.cuentaservice.service.CuentaService;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
	
	@Autowired
	private CuentaService cuentaService;
	
	@GetMapping
	private ResponseEntity<List<Cuenta>>  getAll() {
		List<Cuenta> cuentas=cuentaService.getAll();

		return ResponseEntity.ok(cuentas);
	}
	
	@GetMapping("/{idCuenta}")
	private ResponseEntity<Cuenta> getById(@PathVariable("idCuenta")int idCuenta) {
		Cuenta cuenta=cuentaService.getById(idCuenta);
		if(cuenta==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(cuenta);
	}
	@PostMapping()
	private  ResponseEntity<Cuenta>  save(@RequestBody Cuenta cuenta) {
		Cuenta cuentaGuardada=cuentaService.save(cuenta);
		if(cuentaGuardada==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(cuentaGuardada);
	}
	
	@GetMapping("/byCliente/{idCliente}")
	private ResponseEntity<List<Cuenta> >findByClienteId(@PathVariable("idCliente") int idCliente){
		List<Cuenta> cuentas=cuentaService.findByClienteId(idCliente);

		return ResponseEntity.ok(cuentas);
	
	}
	
	
	
}
