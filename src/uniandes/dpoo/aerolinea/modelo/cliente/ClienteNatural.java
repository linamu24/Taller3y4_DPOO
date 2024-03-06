package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{
	
	//Atributos
	public static String NATURAL = "Natural";	
	private String	nombre;		
	private String identificador;
		
	//Constructor
	public ClienteNatural (String	nombre) {
		this.nombre=nombre;
		this.identificador=crearIdentificador();
	}
	
	//Metodos
	public String getTipoCliente() {
		return NATURAL;
	}
	
	public String getIdentificador() {
		
		return identificador;
	}
	
	public String crearIdentificador () {
		int numero = ( int ) ( Math.random( ) * 10e7 );
        String codigo = "" + numero;
        while( codigo.length( ) < 7 )
            codigo = "0" + codigo;
        codigo="N"+codigo;
        
        
        while (codigos.contains( codigo ) ) {
        	crearIdentificador();
        	
        }
        return codigo;
	}

}
