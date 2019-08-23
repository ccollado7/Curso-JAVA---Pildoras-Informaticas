public class Declaraciones {

	public static void main(String[] args) {
		
		int c=5; //Creo la variable c y la inicializo con el valor 5
		
		c=7; //Modifico el valor de la variable c al nuevo valor 7
		 
		
		final int d=5; //Declaracion de una constante. Es un valor que a posteriori no se puede modificar 
		
		//d=7; //Si quiero realizar esta operacion el compilador dara error
		
		
		System.out.println(c);
		System.out.println(d);
		
		
		
		// A continuacion utilizare una constante para convertir cm a pulgadas
		
		final double apulgadas=2.54; //Creo una constante para utilizar posteriormente
		
		double cm=6; //Creo una variable donde almaceno el valor en cm que quiero obtener en pulgadas
		
		double resultado=6/apulgadas; //Realizo el calculo para obtener el valor en pulgadas
				
				
		System.out.println("En " + cm + " cm hay " + resultado + "pulgadas"); //Utilizo el operador concatenar en la sentencia print
		
		
		//Se pueden declarar varias variables en la misma linea
		
		int operador1,operador2,resultado1; //Declaro 3 variables de tipo entero. Todavia falta inicializarlas
		
		operador1=8;
		
		operador2=7;
		
		resultado1=operador1 + operador2;
		
		System.out.println(resultado1);
		
	}

}
