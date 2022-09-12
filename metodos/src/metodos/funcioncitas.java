package metodos;

public class funcioncitas {
	
	// Funcion para hacer un System.out
	static void imprimirDatos() {
		System.out.println("Primer funcion de funcioncitas");
	}
	
	// Funcion con argumentos
	static void imprimirDatosArg(String mensaje) {
		System.out.println(mensaje);
	}
	
	//Funcion que haga return booleano
	static boolean regresarBooleano() {
		return true;
	}
	
	// Return int
	static int regresarEntero() {
		return 2017;
	}
	
	// Return String
	static String regresarString() {
	return "Hola mundo";
	}
	
	// Return double
	static double regresarDoble() {
		return 3.1415;
	}
	
	// Return double y arg double
	static double areaTriangulo(double base, double altura) {
		return base * altura / 2;
	}
	
	// Return double + mensaje
	static String areaTrianguloMensaje(double base, double altura) {
		String mensaje = "El area es: " + (base * altura / 2);
		return mensaje;
	}
	
	//	Return string + mensaje
	static String imprimirLongitud(String mensaje) {
		return "La longitud es de: " + mensaje.length();
	}

	
	public static void main(String[] args) {
		imprimirDatos();
		
		imprimirDatosArg("Hola chikistrikis");
		imprimirDatosArg("Como estás?");

		System.out.println(regresarBooleano());
		System.out.println(regresarEntero());
		System.out.println(regresarString());
		System.out.println(regresarDoble());
		
		System.out.println(areaTriangulo(3, 7));
		System.out.println(areaTrianguloMensaje(5, 6));
		
		System.out.println(imprimirLongitud("Tangananica"));
	}

}
