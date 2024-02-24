package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
	
	//Atributos
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
	//Constructor
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		 this.cliente =clienteComprador;
		 this.codigo=codigo;
		 this.tarifa=tarifa;
		 this.vuelo=vuelo;
		 usado=false;

	}

	//Metodos
	public String getCodigo() {
		return codigo;
	}

	public int getTarifa() {
		return tarifa;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public boolean esUsado() {
		return usado;
	}
	
	public void marcarComoUsado() {
		this.usado=true;
	}
	
	
	
}
 