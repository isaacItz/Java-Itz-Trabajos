package modelo;

import java.util.Scanner;

public class Main {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		Cuadrado mycuadrado = new Cuadrado();
		Cuadrado myCubo = new Cubo();
		int lado;
		int op;
		do {

			do {
				System.out.println("ingrese un lado para el cuadrado/cubo");
				lado = leer.nextInt();
				System.err.println(lado<1?"escribe un valor arriba de cero":"");
			}while(lado<1);

			mycuadrado.setl(lado);
			myCubo.setl(lado);
			int op2;
			do {
				System.out.println("que quieres calcular\n1.- area caudrado \n2.- perimetro de un cuadrado\n3.- volumen de un cubo\n"
						+ "4.- perimetro de un cubo \n5.- volver a ingresar lado\n6.- salir ");
				op = leer.nextInt();
				switch (op) {
				case  1:
					do {
						System.out.println("el area del cuadrado con medida de "+lado+" x lado es: "+mycuadrado.calcularArea());
						System.out.println("1.-realizar otro calculo\n2.-ingresar un nuevo dato\n3.-salir");
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op=5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println("opcion invalida\n");
							break;
						}
					}while(op2<1||op2>3);
					break;
				case 2:
					do {
						System.out.println("el perimetro del cuadrado con medida de "+lado+" x lado es "+mycuadrado.calcularPerimetro());
						System.out.println("1.-realizar otro calculo\n2.-ingresar un nuevo dato\n3.-salir");
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op=5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println("opcion invalida\n");
							break;
						}
					}while(op2<1||op2>3);
					break;
				case 3:
					do {
						System.out.println("el volumen del cubo con medida de "+lado+" x lado es: "+((Cubo) myCubo).calcularVolumen());
						System.out.println("1.-realizar otro calculo\n2.-ingresar un nuevo dato\n3.-salir");
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op=5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println("opcion invalida\n");
							break;
						}
					}while(op2<1||op2>3);
					break;
				case 4:
					do {
						System.out.println("el perimetro del cubo con medida de "+lado+" x lado es: "+myCubo.calcularPerimetro());
						System.out.println("1.-realizar otro calculo\n2.-ingresar un nuevo dato\n3.-salir");
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op=5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println("opcion invalida\n");
							break;
						}
					}while(op2<1||op2>3);
					break;
				case 5: 
					break;
				case 6:
					System.exit(0);
					break;

				default:
					System.err.println("opcion invalida\n");
					break;
				}
			}while(op!=5);
		} while (true);


	}

}
