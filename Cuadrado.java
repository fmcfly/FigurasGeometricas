// JAVA BEAN 
public class Cuadrado extends Formas{

	private int lados;
	private double longitud;

	Cuadrado(){
		this.lados = 4;
	}

	public int getLados(){
		return this.lados;
	}

	public void setLongitud(double longitud){
		this.longitud = longitud;
	}

	public double getLongitud(){
		return this.longitud;
	}
}