// JAVA BEAN, que son sinonimo de ecnapsulamiento sirven para transportar información. 
public class CirculoCalculo extends Formas{
	private double radio;
	public double radio1;
	private double pi = 3.1416 ;
    public double resultado;
	public double resultado2;

	CirculoCalculo()
	{

		System.out.println("Vamos a calcular el area y perimetro de un circulo"); 
	   
	}

	public void setRadio(double radio){
		this.radio = radio;
	}

	public double getRadio(){
		return this.radio;
	}

	public void calculoArea(double radio1 ){
	   resultado = pi * ( Math.pow(radio1,2) ); 
	}

	public void calculoArea(){
	   resultado = pi * ( Math.pow(this.radio ,2) ); 
	}


	public void calculoPerimetro (){
	   resultado2 = (2 * pi * this.radio ); 
	}

	public void calculoPerimetro (double radio1){
	   resultado2 = (2 * pi * radio1 ); 
	}


	public double getResultado1(){
		return this.resultado;
	}
	
	public double getResultado2(){
		return this.resultado2;
	}

}
