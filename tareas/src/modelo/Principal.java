package modelo;

import static modelo.Utileria.*;

public class Principal {

	public static void main(String[] args) {

/*

*/

		do {

			int n = leerInt("digite un numero");	
			if (isPerfecto(n)) 
				escribir("el numero "+n+ " es perfecto");
			else 
				escribir("el numero "+n+" no es perfecto");


		}while(continuar("desea volver a calcular un numero"));


	}


}