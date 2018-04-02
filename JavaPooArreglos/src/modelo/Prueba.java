package modelo;

public class Prueba {

	public static void main(String[] args) {
		String s1 = "holacomoestas como comocomo";

		String s2 = "como";
/*
		System.out.println(s1.contains(s2));

		System.out.println(s1.indexOf(s2));

		System.out.println(s1.substring(4,s1.indexOf(s2)+s2.length()));*/

		int contador = 0;
		String sTexto;
		sTexto = s1;
		String sTextoBuscado = s2;
		
		System.out.println(s1.hashCode());
		
		System.out.println(sTexto.hashCode());;

		/*while (sTexto.indexOf(sTextoBuscado) > -1) {
			System.out.println(sTexto);
			sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
			contador++; 
			System.out.println(contador);
		}*/
		
		System.out.println(sTexto);
		
		System.out.println("ult "+s1.length());


	}

}
