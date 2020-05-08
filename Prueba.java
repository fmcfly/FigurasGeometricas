import java.util.Scanner;

public class Prueba{

	public static void main(String [] args){

     int op; 
	  
     Scanner sc = new Scanner(System.in); 
      
     CirculoCalculo cicurlo = new CirculoCalculo(); 

     System.out.println("1. Area ");
      System.out.println("2. Perimetro ");
 
         op = sc.nextInt();


      if(op == 1 )
      {
        System.out.println("Dame el radio del circulo");

		
       
       cicurlo.calculoArea(sc.nextDouble());

        System.out.println("El area  de este cuadrado es de= "+ cicurlo.getResultado1()); 

      }

      else if( op == 2 )
      {

      	System.out.println("Dame el radio del circulo");
           cicurlo.calculoPerimetro(sc.nextDouble());
 
	    System.out.println("El perimetro  de este cuadrado es de= "+ cicurlo.getResultado2()); 

      }

    
     else 

     	 System.out.println("Digita una opcion valida");
    }

      
	}
