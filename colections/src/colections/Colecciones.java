package colections;

public class Colecciones {

	/*
	 * Estructuras de datos
	 * 
	 * 
	 * Son un sistema mediante el cual se organizan los datos en la memoria de nuestra aplicacion que estamos desarrollando. Tenemos muchas formas de organizar esta informacion, como:
	 * 
	 * 
	 * - Arrays (datos primitivos)
	 * 
	 * - Colecciones (clases)
	 *		- Listas (list)
	 *		- Conjuntos (Set/HashSet)
	 *		- Mapas (Map/HashMap)
	 * 
	 * 
	 * 
	 * Los arreglos normales son para un solo tipo de dato, ordenados por indice y tienen un tamanio definido.  
	 * 
	 * Cosas que podemos hacer con arreglos normales
	 * 	- Craerlos
	 * 	- Recorrerlos
	 * 	- Saber su tamanio
	 * 	- Encontar elementos por su indice
	 * 	- Hacer copias
	 *

	 * 
	 *
	 */

	
	public static void main(String[] args) {
		String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		int [] calificaciones = { 1, 4, 6};
		
		//Cosas que podemos hacer en un array "normal"
		System.out.println(meses.length);
		System.out.println("La posicion del indice 1 es: " + meses[1]);
		
		//Ejemplo de arreglo con limite establecido
		int [] numerosdel1Al100 = new int [100];
		
		//foreach para recorrer elementos de un array normal
		
		for (String temporal:meses) {
			System.out.println(temporal);
			
		}
		
	} //main

} // clase colecciones
