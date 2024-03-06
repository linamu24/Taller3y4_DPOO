package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	
	//Atributos
	public double IMPUESTO =0.28;
	
	//Metodos
	public int calcularTarifa (Vuelo vuelo, Cliente cliente) {
		
		double cB= calcularCostoBase (vuelo, cliente);
		double pD=calcularPorcentajeDescuento (cliente);
	
		double tarifa= cB - (cB*pD) + (cB-(cB*pD))*IMPUESTO;
		return (int)tarifa;
	}
	
	protected abstract int calcularCostoBase (Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento (Cliente cliente);
	
	
	protected int calcularValorImpuestos (int costoBase) {
		
		double impuesto= (double)costoBase* IMPUESTO;
		return (int)impuesto;
	}

	
}
