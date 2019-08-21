
public class Declaraciones_Operaciones {

	public static void main(String[] args) {
		
		int a=5; //Declaro e inicio variable en la misma linea
		
		int b; //Declaro variable
		
		b=7; //Inicio la variable en otra linea
		
		
		
		int c=b+a; // Declaro la variable c y la inicializo utilizando el operador suma de las variables a y b
		
		c++; //Incremento en 1 el valor de la variable c definida anteriormente
		
		c+=6; //Incremento en 6 el valor de la variable c
		
		
		
		int d=b-a; //Declaro la variable d y la inicializo utilizando el operador resta de las variables a y b
		
		
		
		int e=b/a; //Declaro la variable e y la inicializo utilizando el operador resta de las variables a y b. CUIDADO con que el valor se almacena en un INT(valor entero)
		
		
		//A continuacion defino TODAS variables double para poder realizar la division en punto flotante
		
		double f=5;
		double g=7;
		
		double h=g/f; //Realiza la division en punto flotante
		
		System.out.println(c); //Imprimo en consola el valor de la variable c
		 
		System.out.println(d); //Imprimo en consola el valor de la variable d
		
		System.out.println(e); //Imprimo en consola el valor de la variable e
		
		System.out.println(h); //Imprimo en consola el valor de la variable h, la cual corresponde a punto flotante
		
	}

}
