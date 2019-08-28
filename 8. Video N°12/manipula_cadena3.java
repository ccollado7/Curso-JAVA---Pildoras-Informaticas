
public class manipula_cadena3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String alumno1,alumno2; //Declaro 2 variables objeto string
		
		alumno1="David"; //Declaro la variable 1
				
		alumno2="David"; //Declaro la variable 2
		
		System.out.println(alumno1.equals(alumno2)); //Comparo los dos String. Si son iguales devuelve True, caso contrario False. Importante recordar que distingue mayusculas de minusculas
		
		
		//Otro ejemplo
		
		String alumno3,alumno4; //Declaro 2 variables objeto string
		
		alumno3="David"; //Declaro la variable 1
				
		alumno4="david"; //Declaro la variable 2
		
		System.out.println(alumno3.equals(alumno4)); //Comparo los dos String. Si son iguales devuelve True,caso contrario False. Importante recordar que distingue mayusculas de minusculas
		
		// Otro ejemplo
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); //En este casi no distingue mayusculas de minusculas
	}

}
