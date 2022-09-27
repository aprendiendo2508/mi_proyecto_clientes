package com.nirma.clienteservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {
	private int id;
	private int numeroCuenta;
	private int idCliente;
	private double saldo;
	private int estado;
}
