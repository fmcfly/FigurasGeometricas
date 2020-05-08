//Importar la libreria
import java.util.Scanner;

public class Areas{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);

		Rectangulo rectangle =  new Rectangulo();
		System.out.println(" Ingresa la base del rectangulo");
		rectangle.setBase(sc.nextDouble());
	

		System.out.println("Ingresa la altura del rectangulo");
		rectangle.setAltura(sc.nextDouble());

		//AREA
		double area = rectangle.getBase() * rectangle.getAltura();

		rectangle.setArea(area);

		System.out.println("El area del Rectangulo es de = " + rectangle.getArea());

		//PERIMETRO
		double perimetro = rectangle.getBase() + rectangle.getBase() + rectangle.getAltura() + rectangle.getAltura();

		rectangle.setPerimetro(perimetro);

		System.out.println("El perimetro del Rectangulo es de = " + rectangle.getPerimetro());

	}
}