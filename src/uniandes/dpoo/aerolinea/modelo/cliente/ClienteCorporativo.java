package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.HashSet;
import java.util.Set;

import org.json.JSONObject;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
	//Atributos
	public static String CORPORATIVO = "Corporativo";	
	public static int GRANDE = 1;	
	public static int MEDIANA = 2;	
	public static int PEQUENA = 3;
	private String	nombreEmpresa;		
	private int	tamanoEmpresa;	
	private String identificador;
	
	
	//Constructor
    public ClienteCorporativo(String nombreEmpresa, int tamano) {
    	this.nombreEmpresa=nombreEmpresa;
    	this.tamanoEmpresa=tamano;
    	this.identificador=crearIdentificador();
    }

    //Metodos
    public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public int getTamanoEmpresa() {
		return tamanoEmpresa;
	}
	
	public String getTipoCliente() {
		return CORPORATIVO;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public String crearIdentificador () {
		int numero = ( int ) ( Math.random( ) * 10e7 );
        String codigo = "" + numero;
        while( codigo.length( ) < 7 )
            codigo = "0" + codigo;
        codigo="C"+codigo;
        
        
        while (codigos.contains( codigo ) ) {
        	crearIdentificador();
        	
        }
        return codigo;
	}
   
    /**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

	/**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
}
