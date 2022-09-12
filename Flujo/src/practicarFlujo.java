import java.util.Scanner;

public class practicarFlujo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Variables
		System.out.println("Ingrese un numero del 1 al 4");

		int estacion = sc.nextInt();

		switch (estacion) {
		case 1:
			System.out.println("Primavera");
			break;
		case 2:
			System.out.println("Verano");
			break;
		case 3:
			System.out.println("Jalowin");
			break;
		case 4:
			System.out.println("Navidad");
			break;
		default:
			System.out.println("Su numero no es valido");

			/*
			 * Ejercicio #1 Calcular el descuento de usuario segun su nivel Fan Club
			 * Cinepolis
			 * 
			 * Variables: Nivel Fan, Descuento Niveles: 1 - 5%, 2 - 10%, 3 - 20%, 4 - 50%
			 * Output: "Usted es Superfan de nivel $nivel y su descuento es de $descuento"
			 */

			Scanner op = new Scanner(System.in);
			int nivel = op.nextInt();

			System.out.println("Bienvenido al Sistema de Descuentos de Cinepolis");

			switch (nivel) {
			case 1:
				System.out.println("Usted es Superfan de nivel" + nivel + ", y su descuento es del 5%");
				break;
			case 2:
				System.out.println("Usted es Superfan de nivel" + nivel + ", y su descuento es del 10%");
				break;
			case 3:
				System.out.println("Usted es Superfan de nivel" + nivel + ", y su descuento es del 20%");
				break;
			case 4:
				System.out.println("Usted es Superfan de nivel" + nivel + ", y su descuento es del 50%");
				break;
			default:
				System.out.println("ERROR 404: LEVEL NOT FOUND");
			}
			
		/*
		 * Ejercicio #2
		 * 
		 * Calcular la mensualidad de el usuario segun su nivel y cupon de descuento
		 * int cupon = 10;
		 * Variables: Nivel, Mensualidad, Cupon
		 * Niveles: basico, Intermedio, Completo, Pro
		 * Output: "Suscripcion $suscripcion de: $mensualidad aplicando cupon de promocion"
		 * 
		 * Monto: Basico = $100, Intermedio = $120, Completo = $170, Pro = $250;
		 * 
		 * Mensualidad: monto - (monto * cupon)
		 * 
		 * 100 * .10 = 10%
		 */
			
			System.out.println("Ingrese su nivel de Mensualidad para obtener su descuento");

	        final double cupon = .10;
	        double mensualidad;
	        int nivelUsuario, monto;
	        nivelUsuario = sc.nextInt();

	        switch(nivelUsuario) {
	            case 1:
	                monto = 100;
	                mensualidad = monto - (monto * cupon);
	                System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
	                break;
	            case 2:
	                monto = 120;
	                mensualidad = monto - (monto * cupon);
	                System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
	                break;
	            case 3:
	                monto = 170;
	                mensualidad = monto - (monto * cupon);
	                System.out.println("Suscripcion " + nivelUsuario + "de: " + mensualidad + " " + " aplicando cupon de promocion");
	                break;
	            case 4:
	                monto = 250;
	                mensualidad = monto - (monto * cupon);
	                System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + " aplicando cupon de promocion");
	                break;
	                default:
	                    System.out.println("Ingresa un valor valido");
			}
			
			
		}
	}

}
