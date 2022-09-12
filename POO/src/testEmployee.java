import org.generation.nomina.Employee; //Si dejamos el*, tendremos acceso a todos los elementos. En este caso, la unica clase que nos uimporta es la clase Employee.


public class testEmployee {

	public static void main(String[] args) {
		//CONSTRUCTOR POR DEFAULT
		//Es importante mantener el orden de los parametros al momento de construir a nuestro empleado
		Employee Felipe = new Employee("Felipe", "Maqueda", 30, "MAGF920416XXX", 350.65);
		Employee Angel = new Employee("Angel", "Martinez", 24, "MAGA971015XXX", 1024.50);
		
		System.out.println(Felipe);
		System.out.println(Angel);
	
		System.out.println("salario de Felipe");
		
		Felipe.calculateSalary();
		Felipe.calculateSalary(10);
		Felipe.calculateSalary(10, 2);
		System.out.println();
	
		
		System.out.println("salario de Angel");
		Angel.calculateSalary();
		System.out.println();
	
	}//main
}//public class
