package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

	//Atributos
	protected int COSTO_POR_KM = 1000;

	
	//Metodos
	public int calcularCostoBase (Vuelo vuelo, Cliente cliente) {
		Aeropuerto a1=vuelo.getRuta().getOrigen();
		Aeropuerto a2=vuelo.getRuta().getDestino();
		int distancia= Aeropuerto.calcularDistancia(a1,a2);
		int costo= 0;
		
		costo =distancia*COSTO_POR_KM;
	
		return costo;
		
	}
	
	public double calcularPorcentajeDescuento (Cliente cliente) {
		
		// No hay descuentos en temporada Alta
		return 0;
		
	}
}
