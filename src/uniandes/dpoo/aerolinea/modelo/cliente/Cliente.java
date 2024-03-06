package uniandes.dpoo.aerolinea.modelo.cliente;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	//Atributos
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	protected static Set<String> codigos = new HashSet<String>( ); 

	//Constructor
	public Cliente() {
		tiquetesSinUsar = new LinkedList<Tiquete>( );
        tiquetesUsados = new LinkedList<Tiquete>( ); 
	}
	
	//Metodos
	public List<Tiquete>  getTiquetesSinUsar () {
		return tiquetesSinUsar;
	}
	public abstract String getTipoCliente (); 
	
	public abstract String getIdentificador (); 
	
	public void agregarTiquete (Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
		
	}
	
	public int calcularValorTotalTiquetes () {
		int total=0;
		for (Tiquete tiquete: tiquetesSinUsar) {
			total+=tiquete.getTarifa();
		}
		for (Tiquete tiquete: tiquetesUsados) {
			total+=tiquete.getTarifa();
		}
	
		return total;
	}
	
	public void usarTiquetes (Vuelo vuelo) {
		
		for (Tiquete tiquete: vuelo.getTiquetes()) {
			if (tiquetesSinUsar.contains(tiquete)) {
				tiquete.marcarComoUsado();
				tiquetesSinUsar.remove(tiquete);
				tiquetesUsados.add(tiquete);
			}
		}

	}


}
