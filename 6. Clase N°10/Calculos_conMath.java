
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Utilizo la Clase Math y el metodo sqrt para calcular la raiz cuadrada
		
		double raiz=Math.sqrt(9); //Recordar que para el metodo sqrt debo utilizar un tipo de dato double
		
		System.out.println(raiz);
		
		
		
	
		// Utilizo la Clase Math y el metodo round para redondear
	
		float num1=5.85F; //Declaro una variable tipo float. Recordar del sufijo F despues el valor numerico.
				
		int resultado=Math.round(num1); //Se tiene 2 metodos round para utilizar. Prestar atencion cual se utiliza con respecto al tipo de dato de entrada y tipo de dato de salida
	
		
		System.out.println(resultado); //Imprimo el resultado redondeado
		
		
		
		
		// Refundicion (convertir un tipo de dato a otro)
		
		double num2=5.85;
		
		int resultado1=(int) Math.round(num2); //La refundicion la realizo colocando la sentencia (int) antes de la Clase Math
		
		System.out.println(resultado1);
		
		
		

		//Metodo pow (potencia)
		
		double base=5;
		
		double exponente=3;
		
		int resultado2=(int) Math.pow(base,exponente); //El metodo pow recibe dos parametros del tip double y devuelve el valor de tipo double. Realizo una refundicion a (int)
		
		System.out.println(" El resultado de " + base + " elevado a " + exponente + " es " + resultado2);
	}

}
