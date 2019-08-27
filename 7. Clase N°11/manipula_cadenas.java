
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo un objeto String con mi nombre

		String nombre="Claudio"; //Declaro una variable string, las cuales SIEMPRE tienen que estar entre comillas dobles
		
		System.out.println("Mi nombre es " + nombre); //Imprimo mi nombre
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras"); //Utilizo el metodo lenght() para obtener la cantidad de letras de mi nombre
		 
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0)); //Utilizo el metodo charAt para obtener la letra de la posicion 0
	
		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
	
		int ultima_letra; //Creo una variable del tipo entero
		
		ultima_letra = nombre.length(); //Obtengo el largo del nombre
		 
		System.out.println("La ultima letra de " + nombre + " es " + nombre.charAt(ultima_letra-1)); //Imprimo el ultimo caracter de Claudio utilizando la variable ultima_letra
	 
	}

}
