package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	
	//Atributos
	public double IMPUESTO =0.28;
	
	//Metodos
	public int calcularTarifa (Vuelo vuelo, Cliente cliente) {
		
		// TODO Implementar el método
		return 0;
	}
	
	protected abstract int calcularCostoBase (Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento (Cliente cliente);
	
	protected int calcularDistanciaVuelo (Ruta ruta) {
		
		// TODO Implementar el método
		return 0;
	}
	
	protected int calcularValorImpuestos (int costoBase) {
		
		// TODO Implementar el método
		return 0;
	}

}
