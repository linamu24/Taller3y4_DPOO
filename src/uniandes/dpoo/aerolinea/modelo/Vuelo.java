package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;

public class Vuelo {
	
	//Atributos
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String,Tiquete> tiquetes;
	
	//Constructor
	public Vuelo (String fecha, Avion avion, Ruta ruta) {
		this.fecha= fecha;
		this.avion=avion;
		this.ruta=ruta;
		tiquetes = new HashMap<String, Tiquete>( );
	
	}

	//Metodos
	public String getFecha() {
		return fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public Ruta getRuta() {
		return ruta;
	}
	
	public Collection <Tiquete> getTiquetes() {
		return tiquetes.values();
	}

	public int venderTiquetes (Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException {
		int cantidadT= cantidad + tiquetes.size();
		
		
		if (cantidadT<=avion.getCapacidad()) {
			int tarifa= calculadora.calcularTarifa(this, cliente);
			int precioTotal=tarifa*cantidad;
			while (cantidad>0) {
				Tiquete tiquete= GeneradorTiquetes.generarTiquete(this,cliente,tarifa );
				tiquetes.put(tiquete.getCodigo(), tiquete);
				cliente.agregarTiquete(tiquete);
				GeneradorTiquetes.registrarTiquete(tiquete);
				}
			
			
			return precioTotal;	
			
		}	
		else {
			throw new VueloSobrevendidoException(this);
		}
		
	}
	
	public boolean equals (Object obj) {
		
		return super.equals(obj);
	}

}
