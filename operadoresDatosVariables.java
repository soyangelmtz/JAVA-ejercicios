
public class operadoresDatosVariables {

	public static void main(String[] args) {
		// Todo lo que necesitamos que se ejecute, lo ponemos dentro de main
		
		/* Tipos de datos
		 * 
		 * - Grupo de datos primitivos
		 * 	-byte: 1 byte -128 al 127
		 * 	-short: 2 bytes (-32768 al 32767)
		 * 	-int: 4 bytes (-2,147,483,648 al 2,147,483,647)
		 * 	-long: 8 bytes (-9,223,372,036,854,775,808 al 9,223,372,036,854,775,807)
		 * 	-float: 4 bytes, almacena numeros fraccionarios, 6 o 7 digitos decimales.
		 * 	-double: 8 bytes, almacena numeros fraccionarios, 15 digitos decimales.
		 * 	-boolean: 1 bit, almacena datos true o false
		 * 	-char: 2 bytes, almacena caracteras o letras en formato ASCII
		 * 
		 * - Grupo de datos no primitivos
		 * 
		 */
		
		//Numeros
		
		byte edadHumano = 17 ;
		short edadTortuga = 150;
		int edadTierra = 4543000;
		long edadUniverso = 456777802048L;
		float pi = 3.1416f;
		double piGrande = 3.14159265359d;
		
		//Booleanos
		boolean estudiamosJava = true;
		boolean quieroHacerExamen = false;

		//Caracteres
		char inicialNomre = 'L';
		
		byte edad = 1;
		char edad2 = '1';
		
		//Variables en Java
		
		/*
		 * Las variables son contenedores que nos permiten almacenar valores de datos o informacion (vaso de agua, vaso de leche, vaso de refresco, etc)
		 * 
		 * - String: almacena texto en forma de cadena, y se usan las comillas dobles
		 * - int: almacena datos enteros
		 * - float: almacena datos tipo coma flotante
		 * - char: almacena caracteres individuales como A, 1 y se usan las comillas simples
		 * - booleanos: almacenan valores con dos estados: true o false
		 * 
		 */
		
		String nombre = "Martin";
		int numeroDomicilio = 9;
		float estatura = 1.73f;
		char grupo = 'A';
		boolean descanso = false;
		
		//Declaración vs Inicialización
		
		String declaracion;
		
		declaracion = "si";
		
		final int anios;
		anios = 70;
		
		
		//println imprime con salto de linea
		//print imprime todo de corrido
		System.out.println("Hola mundo");
		System.out.println("Nos vamos a descansito: " + descanso);
		System.out.println(anios);
		System.out.println(5+60);
		
		
		//Declarar multiples variables
		
		int x = 50;
		int y = 15;
		int z = 25;
		
		int a = 24, b = 55, c = 50;
		
		System.out.println(x + y + z);
		System.out.println(a + b + c);
		
		/*
		 * Conversion de tipos de datos en Java (casting o casteo)
		 * 
		 * Es cuando se asigna un valor de un tipo de datos primitivo a otro.
		 * 
		 * - Ampliacion: de un tipo pequeño a un tipo mas grande
		 * - Reduccion: de un tipo grande a un tipo mas pequeño, no todos los tipos se pueden reducir
		 * 
		 */
		
		
	}//main
}//class

//Operadores aritmeticos
System.out.println("Operadores aritmeticos");
numero1++;
numero2--;
int suma = numero1 + numero2;
int resta = numero2 - numero1;
int multiplicacion = numero1 * numero2;
double division = numero1 / numero2;
float modulo = numero1 % numero2;
numero1++;
numero2--;


System.out.println(suma);
System.out.println(resta);
System.out.println(multiplicacion);
System.out.println(division);
System.out.println(modulo);
System.out.println(numero1);
System.out.println(numero2);

// Operadores de asignacion (=)
System.out.println("Operadores de asignacion");
int dinero = 4;
dinero += 3;
dinero = dinero + 3;
dinero == 5;
dinero *= 8;
dinero /= 4;
dinero %=3;

//Operadores bit a bit
dinero &= 5;
dinero != 5;
dinero >>= 3;
System.out.println("El valor de la variable dinero es: " + dinero);

//Ejemplo con reasignacion usando ++
int ahorro = 10;
int domingo = ++ahorro; //11
//ahorro = ahorro + 1
System.out.println("Mi primer ahorro es: " + ahorro);

//Ejemplo usando operador suma (+)
int ahorro2 = 10;
int domingo2 = 1 + ahorro2; //		

System.out.println("Mi segundo ahorro es: "+ ahorro2);

//Operadores de comparacion

/*
 * En JS, usamos un operador llamado "estrictamente igual (===)". Este nos permitia evaluar el tipo de dato y el valor, los cuales deben coincidir.
 */

 int numero3 = 5;
 int numero4 = 6;

boolean igual = numero3 == numero4; // False
boolean noIgual = numero3 != numero4; // true
boolean mayorQue = numero3 > numero4; // false
boolean menorQue = numero3 < numero4; // true
boolean mayorIgualQue = numero3 >= numero4; // false
boolean menorIgualQue = numero3 <= numero4; //  true

System.out.println(igual);
System.out.println(noIgual);
System.out.println(mayorQue);
System.out.println(menorQue);
System.out.println(mayorIgualQue);
System.out.println(menorIgualQue);

// Operadores logicos (&&, ||, !)
// && (AND) devuelve un true si se resuelven las dos condiciones
// || (OR) devuelve un true si una de las condiciones se cumple
// ! (NOT) invierte el resultado

int numero5 = 7;
int numero6 = 7;
int numero7 = 8;

//Operadores de asignacion (=)
		System.out.println("Operadores de asignacion");
		int dinero = 4; //asigno valor a int dinero
		dinero += 3; //dinero = dinero + 3
		dinero = dinero + 3; //valor esperado 10
		dinero -= 5;// dinero = dinero - 5
		dinero *= 8;
		dinero /= 4;
		dinero %= 3;//
		//Operadores bit a bit
		dinero &= 5; //
		dinero |=5;
		dinero >>= 3;
		System.out.println("El valor de la variable dinero es: " + dinero);

//Ejemplo con reasignacion usando ++
int ahorro = 10;
int domingo = ++ahorro; //11
//ahorro = ahorro + 1
System.out.println("Mi primer ahorro es: " + ahorro);

//Ejemplo usando operador suma (+)
int ahorro2 = 10;
int domingo2 = 1 + ahorro2; //		

System.out.println("Mi segundo ahorro es: "+ ahorro2);

