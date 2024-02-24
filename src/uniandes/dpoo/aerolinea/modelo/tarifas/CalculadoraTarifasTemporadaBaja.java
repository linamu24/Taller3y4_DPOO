package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

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
		
		// TODO Implementar el método
		return 0;
		
	}
	
	public double calcularPorcentajeDescuento (Cliente cliente) {
		
		// TODO Implementar el método
		return 0;
		
	}


}