package modelo;

public class Cubo extends Cuadrado {

	public int calcularVolumen() {
		return l*l*l;
	}
	
	@Override
	public int calcularPerimetro() {
		return 12*l;
	}
	
}
