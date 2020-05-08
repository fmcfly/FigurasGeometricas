//importa librerias o clases
import java.util.Scanner;

public class MiniProyecto{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// MENU
		System.out.println("Escoge la opción");
		System.out.println("1) Rectangulo");
		System.out.println("2) Circulo");
		System.out.println("3) Triangulo Isoceles");
		// AQUI VA TU PARTE ANAKIN
		int opcion = sc.nextInt();		
		switch(opcion){
			case 1:
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
			break;
			case 2:
				CirculoCalculo circle = new CirculoCalculo();
				System.out.println("Dame el radio del circulo");
				circle.setRadio(sc.nextDouble());
				circle.calculoArea();
				System.out.println("El area es " + circle.getResultado1());
				circle.calculoPerimetro();
				System.out.println("El perimetro es " + circle.getResultado2());
			break;
			case 3:
				// Triangulo Iscoleses
				TrianguloIso calc =new TrianguloIso();

				System.out.println("Dame la longitud de la base");
				calc.setBase(sc.nextDouble());


				System.out.println("Dame la longitud de los lados");
				calc.setLados(sc.nextDouble());

				double perimetrot=(calc.getLados() * 2)+ calc.getBase();
				calc.setPerimetro(perimetrot);
				System.out.println("EL perimetro es: "+calc.getPerimetro());
			break;
		}
	}
}