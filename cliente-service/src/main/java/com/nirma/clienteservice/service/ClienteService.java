package com.nirma.clienteservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirma.clienteservice.entity.Cliente;
import com.nirma.clienteservice.feign.CuentaFeign;
import com.nirma.clienteservice.model.Cuenta;
import com.nirma.clienteservice.repository.IClienteRepository;

@Service
public class ClienteService {
	@Autowired
	IClienteRepository clienteRepository;
	
	@Autowired
	CuentaFeign cuentaFeign;
	
	public List<Cliente> getAll(){
		List<Cliente> misClientes=clienteRepository.findAll();
		return misClientes;
	}
	
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getById(int idCliente) {
		return clienteRepository.findById(idCliente).orElse(null);
	}
	
	public Cuenta saveCuenta(Cuenta cuenta) {
		return cuentaFeign.save(cuenta);
	}
	public List<Cuenta> findCuentasXcliente(int idCliente){
		return cuentaFeign.findCuentasPorCliente(idCliente);
	}
}
