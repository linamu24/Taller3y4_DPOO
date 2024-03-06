package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas 
{
	
	//Atributos
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected double DESCUENTO_PEQ = 0.02;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
	
	//Metodos
	public int calcularCostoBase (Vuelo vuelo, Cliente cliente) {
		
		Aeropuerto a1=vuelo.getRuta().getOrigen();
		Aeropuerto a2=vuelo.getRuta().getDestino();
		int distancia= Aeropuerto.calcularDistancia(a1,a2);
		int costo= 0;
		
		if (cliente.getTipoCliente()=="Natural") {
			costo =distancia*COSTO_POR_KM_NATURAL;
		}
		else {
			costo =distancia*COSTO_POR_KM_CORPORATIVO;
		}
		
		return costo;
		
	}
	
	public double calcularPorcentajeDescuento (Cliente cliente) {

		double descuento=0;
		if (cliente.getTipoCliente()=="Corporativo") {
			descuento= descuentoCorporativo((ClienteCorporativo) cliente);

		}
		return descuento;
		
	}

	private double descuentoCorporativo(ClienteCorporativo cliente) {
		int tamanio=cliente.getTamanoEmpresa();
		double descuento=0;
		if (tamanio==1) {
			descuento=DESCUENTO_GRANDES;
		}
		else if (tamanio==2) {
			descuento=DESCUENTO_MEDIANAS;
		}
		else if (tamanio==3) {
			descuento=DESCUENTO_PEQ;
		}
		return descuento;
	}


}