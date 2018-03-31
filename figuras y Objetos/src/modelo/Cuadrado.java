package modelo;

public class Cuadrado {
	
	protected int l;
	
	public void setl(int l) {
				this.l = l;
	}
	
	public int calcularArea() {
		 return l*l;
	}
	
	public int calcularPerimetro(){
		return 4 * l;
	}
	
}
