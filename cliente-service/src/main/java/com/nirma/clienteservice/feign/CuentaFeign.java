package com.nirma.clienteservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nirma.clienteservice.model.Cuenta;

@FeignClient(name = "cuenta-service", url = "http://localhost:8099/cuenta/")
public interface CuentaFeign {
	
	@PostMapping
	Cuenta save(@RequestBody Cuenta cuenta) ;
	
	@GetMapping("byCliente/{idCliente}")
	List<Cuenta> findCuentasPorCliente(@PathVariable("idCliente") int idCliente);
}