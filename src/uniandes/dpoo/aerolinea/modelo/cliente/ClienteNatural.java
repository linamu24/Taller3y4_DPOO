package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{
	
	//Atributos
	public static String NATURAL = "Natural";	
	private String	nombre;		
		
	//Constructor
	public ClienteNatural (String	nombre) {
		this.nombre=nombre;
	}
	
	//Metodos
	public String getTipoCliente() {
		return NATURAL;
	}
	
	public String getIdentificador() {
		// TODO Implementar el método
		return "";
	}
	

}
