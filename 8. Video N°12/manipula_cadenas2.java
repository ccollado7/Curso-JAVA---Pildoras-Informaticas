
public class manipula_cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo dia para aprender a programar en Java"; //Creo una variable objeto del tipo String

		//A continuacion pretendo obtener la porcion o substring "aprender a programar en Java"
				
		String frase_resumen = frase.substring(1, 3); //Obtengo un substring formado por dos letras. En el conteo se deben considerar los espacios es blanco
		
		System.out.println(frase_resumen);
		
		
				
		// A continuacion obtengo el texto deseado
	
		String frase_resumen1 = frase.substring(29, 57);
		
		System.out.println(frase_resumen1);
		
		
		
		// Otro ejemplo
	
		String frase_resumen2 = frase.substring(0, 29) + "irnos a la plata y olvidarnos de todo....";
		
		System.out.println(frase_resumen2);
		
		
		
		// Otro ejemplo
		
			String frase_resumen3 = frase.substring(0, 29) + "irnos a la plata y olvidarnos de todo...." + " y " + frase.substring(29, 57);
			
			System.out.println(frase_resumen3);
	}

}
