import java.util.Scanner;

public class dataEntry {

	public static void main(String[] args) {
		
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
		
//	Scanner sc = new Scanner(System.in);
//	Scanner dato = new Scanner(System.in);
//	
//	//DATA INPUTS
//	System.out.println("Escribe tu nombre");
//	String nombre = sc.nextLine();
//	System.out.println("Que edad tienes?");
//	int edad = sc.nextInt();
//	System.out.println("Escribe tu correo");
//	String correo = dato.nextLine();
//	System.out.println("Escribe tu telefono");
//	long telefono = sc.nextLong();
//	System.out.println("Estudias programacion? (true/false)");
//	boolean estudiaProgramacion = sc.nextBoolean();
////	char inicialNombre = sc.nextcharAt();
//	System.out.println("Cuanto mides?");
//	float estatura = sc.nextFloat();
//	
//	System.out.println("Tu nombre es: " + nombre);
//	System.out.println("Tu edad es: " + edad);
//	System.out.println("Tu correo es: " + correo);
//	System.out.println("Tu numero de telefono es: " + telefono);
//	System.out.println("Estudias Programacion: " + estudiaProgramacion);
//	System.out.println("Tu estatura es: " + estatura);
	
//	if(sc.hasNextString()) {
//		System.out.println("verdadero, si ingresaste un string");
//	}else {
//		System.out.println("No es un string");
//	}
	
	/*
	 *  Metodos para comprobar que el tipo de dato que estoy ingresando sea el correcto
	 *  
	 *  hasNextBoolean() true
	 *  hasNextByte()
	 *  hasNextDouble
	 *  hasNextFloat
	 */
	
	
	//Crea un programa sencillo para calcular area de un triangulo, solicitando por consola los datos de la base y la altura
	
	float base, altura, area;
	Scanner scBase, scAltura;
	
	System.out.println("Calculadora de Area de Triangulos\n\n\n\n");
	
	//Lectura y almacenamiento de la base
	System.out.println("Ingrese la base del triangulo: \n");
	scBase = new Scanner(System.in);
	base = scBase.nextFloat();
	
	//Lectura y almacenamiento de la altura
	System.out.println("Ingrese la altura del triangulo: \n");
	scAltura = new Scanner(System.in);
	altura = scAltura.nextFloat();
	
	//Calculo e impresion del area
	area = (base * altura)/2;
	System.out.println("\nEl area del triangulo es:\n" + area + " unidades cuadradas");
	
	//Cierre del escaner
	scBase.close();
	scAltura.close();
	
//	String nombre = sc.nextLine();
	
	} // cierre de main

} //cierre de class ingresoDatos

