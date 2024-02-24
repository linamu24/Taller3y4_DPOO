package uniandes.dpoo.aerolinea.modelo.cliente;


import java.util.LinkedList;
import java.util.List;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	//Atributos
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;

	//Constructor
	public Cliente() {
		tiquetesSinUsar = new LinkedList<Tiquete>( );
        tiquetesUsados = new LinkedList<Tiquete>( ); 
	}
	
	//Metodos
	public abstract String getTipoCliente (); 
	
	public abstract String getIdentificador (); 
	
	public void agregarTiquete (Tiquete tiquete) {
		
		// TODO Implementar el método

	}
	
	public int calcularValorTotalTiquetes () {
		
		// TODO Implementar el método
		return 0;
	}
	
	public void usarTiquetes (Vuelo vuelo) {
		
		// TODO Implementar el método

	}
}
