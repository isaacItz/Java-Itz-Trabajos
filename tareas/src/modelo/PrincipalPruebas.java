package modelo;
import static modelo.Utileria.*;
public class PrincipalPruebas {

	public static void main(String[] args) {

		int numero = leerInt("ingrese el numero");
		
		//String x= leerCadena("ingresa tu nombre");
		//String salida = "usted tiene "+edad+" años";
		
		//escribir(salida);
		
		boolean primo = isPrimo(numero);
		
		String salida = primo?numero+" es primo" : numero+" no es primo";
		//si primo es true entonces asigna "es primo" pero si no asigna numero + no es primo
		
		escribir(salida);
		
		
//				if	(primo)
//					escribir("el numero "+numero+" es primo");
//				else 
//					escribir("el numero "+numero+" no es primo");
		
	}

}
