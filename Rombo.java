class Rombo{
	
	private double []  datos = new double[2];

	double getArea(){
		double area=(this.datos[0] * this.datos[1])/2; 
		return area;
	}

	double getArea2(){
		double area=this.datos[0] * this.datos[1]; 
		return area;	
	}

	void setDatos(double []datos){
		this.datos = datos;
	}

}