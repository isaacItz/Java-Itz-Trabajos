package modelo;
import static modelo.Utileria.*;
public class Principal {

	final static int N = 40;

	public static void main(String[] args) {



		String opciones[] = {"Vectores","Matrices","Arreglos Multidimensionales"};
		String[] grupo = new String[40];

		int mos = 0;
		int contador = 0;
		do {

			mos = mostrarMenu(opciones);

			switch (mos) {
			case 1:
				int opVec = 0;	
				String[] opcionesVector = {"registrar","consultar","modificar","eliminar","listar","ordenar"};
				do {
					opVec = mostrarMenu(opcionesVector);
					switch (opVec) {
					case 1:
						//aqui se llena el vector
						contador = capturarAlumnos(grupo, contador);
						escribir("contador vale"+contador);

						break;
					case 2: 
						if(contador>0) {
							do {
								String nombre = leerCadena("ingrese el nombre del alumno");
								boolean encontrado = existe((obtenerPersona(grupo, contador, nombre)), contador);

								String res = encontrado?"el alumno si existe":"el alumno no existe";

								escribir(res);

							}while(continuar("quieres buscar otro alumno"));
						}else escribir("no hay alumnos registrados");
						break;
					case 3:
						//modificar;
						if(contador>0) {
							do {

								String nombre = leerCadena("ingresa el nombre del alumno a modificar");
								int pos = obtenerPersona(grupo, contador, nombre);
								if(existe(pos, contador)) {
									String nuevoNombre = leerCadena("escriba el nuevo nombre para el alumno");
									grupo[pos] = nuevoNombre;
									escribir("alumno modificado con exito");
								}else escribir("el alumno no existe");


							}while(continuar("quieres seguir modificando alumnos"));
						}else escribir("no hay alumnos registrados");
						break;
					case 4:
						//vamos a eliminar
						if(contador>0) {
							do {
								String alumno = leerCadena("ingresa el nombre del alumno a borrar");
								int pos = obtenerPersona(grupo, contador, alumno);
								if (existe(pos, contador)) {
									int i ;
									for(i = 0; i<contador-1; i++)
										grupo[i] = grupo[i+1];
									escribir("alumno eliminado");
									grupo[i]=null;
									contador--;
								} else {
									escribir("alumno no encontrado");
								}

							}while(continuar("quieres borrar a otro alumno"));

						}else escribir("no hay alumnos registrados");
						break;
					case 5:
						//mostrar el vector


						if (contador>0) {
							String listado = "listado general de alumnos\n";


							//escribir(grupo);
							//														for (int i = 0; i < contador; i++) {
							//															if(grupo[i]==null) continue;
							//															escribir(grupo[i]);
							//														}
							for(int i = 0; i<contador; i++) {
								listado += grupo[i]+"\n";
							}

							escribir (listado);
						}else escribir("no hay alumnos registrados");
						break;


					case 6:
						if (contador>0) {
							ordenar(grupo, contador);
							escribir("Ordenación realizada con exito");
						} else {
							escribir("No hay alumnos registrados");
						}
						break;
					}

				} while (opVec!=opcionesVector.length+1);
				break;

			case 2:

				int opMatices = 0;	
				String[] opcionesMatrices = {"Multiplicar","Sumar","eliminar","modificar","listar"};
				do {
					opMatices = mostrarMenu(opcionesMatrices);
				} while (opMatices!=opcionesMatrices.length+1);
				break;

			case 3:
				escribir("seleccioanste arreglos multidimensionales");

			}


		} while (mos!=opciones.length+1);
		System.out.println("salió");
	}

	private static int contarAlumnos(String alumnos[], String alum) {
		int contador = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if(alum.equals(alumnos[i])) contador++;
		}
		return contador;
	}

	private static boolean consultarAlumno(String alumnos[]){
		String nombre;
		boolean existe;
		do {
			nombre = leerCadena("escriba el nombre del alumno a buscar");
			for (int i = 0; i < alumnos.length; i++) {
				if(alumnos[i]==null) continue;
				if(alumnos[i].equals(nombre)) {
					existe = true;
				}
			}
			existe = false;
		}while(continuar("Deseas Buscar a Otro Alumno?"));
		return existe;
	}

	private static void modificarAlumnos(String[] alumnos) {
		String nombre;
		do {
			nombre = leerCadena("escriba el nombre del alumno");
			for (int i = 0; i < alumnos.length; i++) {
				if(alumnos[i]==null) continue;

				if(alumnos[i].equals(nombre)) {
					alumnos[i]=leerCadena("escriba el nuevo nombre para el alumno");
					escribir("se ha modificado con exito en registro");
					break;
				}else escribir("no se ha encontrado el alumno");
			}

		}while(continuar("Deseas Modificar a Otro Alumno?"));
	}

	private static void eliminarAlumno(String[] alumnos) {
		String nombre;
		do {
			nombre = leerCadena("escriba el nombre del alumno");
			if (!nombre.isEmpty()) {
				for (int i = 0; i < alumnos.length; i++) {
					if(alumnos[i]==null) continue;

					if(alumnos[i].equals(nombre)) {
						alumnos[i]=null;
						escribir("se ha eliminado con exito en registro");
						break;
					}else escribir("el alumno no existe");
				}
			}else escribir("no a escrito nada");
		}while(continuar("Deseas Eliminar a Otro Alumno?"));
	}

	private static int capturarAlumnos(String[] grup, int contador) {
		//contador = 0;
		do {
			String nombre = leerCadena("ingrese el nombre del alumno");	
			if(nombre!=null && !nombre.isEmpty()) {

				grup[contador]=nombre;
				System.out.println("guardado en la celda :"+contador);
				contador++;
				escribir("alumno registrado con exito");

			}else {
				escribir("sin parametros");
			}


		} while (contador<N && continuar("deseas ingresar otro alumno"));

		return contador;
	}


	private static int obtenerPersona(String[] grupo, int contador, String nombre) {

		int i = 0;

		while(i<contador&&(!grupo[i].equals(nombre))) i++;

		//return i==contador?true:false;
		return i;

	}

	static boolean existe(int i, int contador) {
		return i<contador;
	}

	static void modificarAlumno(String[] grupo, int indice) {

		grupo[indice] = leerCadena("ingresa el nuevo nombre del alumno");

	}


	public static void ordenarArray(String grupo[], int contador) {
		for(int i = 0; i<contador-1; i++) {
			for(int j = i+1; j<contador; j++) {

				if(grupo[i].compareTo(grupo[j])>0) {
					String aux = grupo[i];
					grupo[i] = grupo[j];
					grupo[j] = aux;
				}
			}

		}
	}

	public static void ordenar(String[] grupo, int contador) {
		for (int i = 0; i < contador-1; i++) {
			for (int j = i+1; j < contador; j++) {
				if(grupo[i].compareTo(grupo[j])>0) {
					String aux=grupo[i];
					grupo[i]=grupo[j];
					grupo[j]=aux;
				}
			}
		}
	}




	//
	//	static boolean contain(String str) {
	//		boolean b = false;
	//		for(int i = 0; i<str.length(); i++) {
	//
	//			if(str.charAt(i)=='x'&&str.charAt(i+1)=='y'&&str.charAt(i+2)=='z') {
	//				for(int k = 0; k<=i; k++) {
	//					System.out.println(k);
	//					if (str.charAt(k)=='.') {
	//						b= true;
	//					}
	//
	//				}
	//				System.out.println("lo contiene");
	//			}
	//
	//			else System.out.println("no lo contiene");
	//
	//		}
	//		if (b==true) {
	//			return false;
	//		}else return true;
	//
	//	}

}
