package modelo;
import static modelo.Utileria.*;
public class PrincipalViernes {

	public static void main(String[] args) {


		String mensaje = "ingrese el numero";
		int n= leerInt(mensaje);

		if (n>0) {

			do {
				escribir(n);
				if(n%2==0) n/=2;

				else n=(n*3)+1;

			} while (n!=1);

			escribir(n);

		} 
		
		else escribir("error de entrada");
		
	}

}
