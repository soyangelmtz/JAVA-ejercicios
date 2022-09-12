package ingresoDatos;

import java.util.Scanner; //ingresar datos desde la consola (como un prompt en JS)

class ingresoDatos {

	public static void main (String[] args) {
		System.out.println("Hola mundo");

		/*
		 * Declaramos nuestro nuevo Scanner para ingresar datos, para esto usamos la palabra reservada Scanner sc, despues creamos un nuevo scanner con la palabra reservada new Scanner y dentro de los parentesis  va la entrada de teclado 
		 */
		
		// Esto ya existe, es documentacion de JAVA
	// Scanner sc = new Scanner(System.in);	//funcion que nos permite crear objetos dependiendo de lo que ingrese el usuario
		
	/*
	 *  DATOS INTRODUCIDOS POR EL USUARIO
	 * 
	 * - boolean
	 * 		boolean nextBoolean() // true, false
	 * - bytes
	 * 		byte nextByte() // 30
	 * - double
	 * 		double nextDouble() // 1.981236475981268 (hasta 15 decimales)
	 * - float
	 * 		float nextFloat() // 3.1415962 (hasta 6 o 7 decimales)
	 * - int
	 * 		int nextInt() // 100
	 * - string
	 * 		string nextString() // Hola, me gustan las gorditas de nata
	 * - long
	 * 		long nextLong() // 1493285672956
	 * - short
	 * 		short nextShort() // 145653
	 */
	
	
	// powerRanger (rangers individuales)
	//
	// PowerRanger (megazord que tiene muchos rangers individuales)
	
		// Programa que pida informacion al usuario y la muestre en pantalla
		
	Scanner sc = new Scanner(System.in);
	Scanner dato = new Scanner(System.in);
	
	String nombre = sc.nextLine();
	int edad = sc.nextInt();
	String correo = dato.nextLine();
	long telefono = sc.nextLong();
	boolean estudiaProgramacion = sc.nextBoolean();
//	char inicialNombre = sc.nextcharAt();
	float estatura = sc.nextFloat();
	
	System.out.println("Tu nombre es: " + nombre);
	System.out.println("Tu edad es: " + edad);
	System.out.println("Tu correo es: " + correo);
	System.out.println("Tu numero de telefono es: " + telefono);
	System.out.println("Estudias Programacion: " + estudiaProgramacion);
	System.out.println("Tu estatura es: " + estatura);
	
//	if(sc.hasNextString()) {
//		System.out.println("verdadero, si ingresaste un string");
//	}else {
//		System.out.println("No es un string");
	}
	
	/*
	 *  Metodos para comprobar que el tipo de dato que estoy ingresando sea el correcto
	 *  
	 *  hasNextBoolean() true
	 *  hasNextByte()
	 *  hasNextDouble
	 *  hasNextFloat
	 */
	
	
	//Crea un programa sencillo para calcular area de un triangulo, solicitando por consola los datos de la base y la altura
	
	
	
	
	
	
//	String nombre = sc.nextLine();
	
	} // cierre de main

} //cierre de class ingresoDatos

