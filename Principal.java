import java.util.Scanner;

class Principal{
	
	public static void main(String args []){

		int salir = 1,regresar=1;
		Rombo rombosman = new Rombo();
		Rectangulo rectangle =  new Rectangulo();
		do{

			Scanner sc = new Scanner (System.in);
			System.out.println("\nDe que figura necesita sus calculos");
			System.out.println("\n 1)Rombo");
			System.out.println(" 2)Rectangulo");
			System.out.println("  Presione 0 si desea salir ");
			
			 
			switch( sc.nextInt() ){
				case 1:
					double [] datos = new double[2] ;
					do{

						System.out.println("\nHa escojido el rombo recuerde que para obtener el area del rombo tiene 2 opciones en base a los datos que tenga");
						System.out.println("\nEscoja la opcion que necesite");
						System.out.println("\n 1)Si tiene las diagonales");
						System.out.println(" 2)Si tiene la base y altura");
						System.out.println("\n \tSi desea regresar al menu anterior presione 0 ");
						System.out.println("\t o si desea salir definitivamente presione 3");

						switch(sc.nextInt()){
							case 1:

								System.out.println("Usted tiene las diagonales por favor brinde las diagonales");
								
								for(int i=0;i<=1;i++){
									System.out.println("Bindre la Diagonal "+ (i+1)) ;
									datos[i] = sc.nextDouble();
								}
								rombosman.setDatos(datos);	
								System.out.println("El area del rombo es " + rombosman.getArea());

							break;
							case 2:

								System.out.println("Usted tiene la base y la altura  por favor brinde los datos");
							

									System.out.println("Bindre la Base: ") ;
									datos[0] = sc.nextDouble();
									System.out.println("Bindre la Altura: ") ;
									datos[1] = sc.nextDouble();								
								
								rombosman.setDatos(datos);	
								System.out.println("El area del rombo es " + rombosman.getArea2());

							break;

							case 0:
								regresar = 0; 
							break;

							case 3:
								regresar =0;
								salir = 0;
							break;

							default: 
								System.out.println("Brinde una opcion valida");
							break;
						}
						
					}while(regresar != 0);	
				break;

				case 2:

				do{

						System.out.println("\nHa escojido el rectangulo");
						
						System.out.println("\nCalcular el area y perimetro");
																	
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
						System.out.println("\nEscoja la opcion que necesite");
						System.out.println("\n \tSi desea regresar al menu anterior presione 0 ");
						System.out.println("\t o si desea salir definitivamente presione 3");

						switch(sc.nextInt()){
			
							case 0:
								regresar = 0; 
							break;

							case 3:
								regresar =0;
								salir = 0;
							break;

							default: 
								System.out.println("Brinde una opcion valida");
							break;
						}
						
					}while(regresar != 0);	

				break;
				case 0:
					salir = 0;
				break;

				default: 
				System.out.println("Brinde una opcion valida");
				break;
			}
		}while(salir != 0);
	}
}