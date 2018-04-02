	package modelo;
	
	import static modelo.Utileria.*;
	
	public class Principal {
	
		public static void main(String[] args) {
	
			
			/*do {
	
				int n = leerInt("digite un numero");	
				if (isPerfecto(n)) 
					escribir("el numero "+n+ " es perfecto");
				else 
					escribir("el numero "+n+" no es perfecto");
	
	
			}while(continuar("desea volver a calcular un numero"));
	
			fibonacci(20);
	*/
			 
			String mensaje ="digite el limete para la suseccion ";
			String numx= "digite x";
			int x= leerInt(numx);
			int lim = leerInt(mensaje);
	
			double poten=0.0;
			double factorial = 0;
			double div=0.0;
			double result=0.0;
			for (int i = 1; i <= lim; i++) {
	
	
			//	for (int j = i; j <=i ; j++) {
	
					poten= Math.pow(x,i);
					System.out.println("potencia es "+x+" a la "+i+" = "+poten);
				//}
	
				factorial=i;
				System.out.print("factorial de "+factorial+" es ");
	
				for (double k = factorial-1; k >0 ; k--) {
					factorial *= k ;	
				}
	
				System.out.println(factorial);

				div=poten/factorial;
	
	
	
				if(i==1) result+=div;
				else {
				if(i%2==0) {
					result-=div;
					System.out.println(" - "+result );	
				}
				else {
					result+=div;
					System.out.println(" + "+result );	
				}
				}
			}
	
	
			escribir("el resultado es: "+result);
	
			/*Object n = leerInt("digita un numero");
	
			escribir(n.toString());*/
	
		}
	
	
	}