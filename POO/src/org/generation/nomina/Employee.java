package org.generation.nomina;

public class Employee {
	
	// Propiedades
	public String firstName;
	public String lastName;
	public int age;
	public String RFC;
	public double salary;
	


	// Constructor
	public Employee(String firstName, String lastName, int age, String rFC, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		RFC = rFC;
		this.salary = salary;
	}
	
//	// Constructor usando String para niombre e int para edad
//	public Employee(String firstName, String lastName, int age, String rFC, double salary) {
//		super();
//		this.firstName = firstName;
//		this.age = age;
//	}
	
	//Estructura de un metodo o una funcion
	//modificador de acceso + tipo de retorno + Nombre + Parametros

	
	// Metodos (acciones a realizar
	
	//Calcular el salario por mes
	// Imprimir el recibo de nomina
	
	public void calculateSalary() {
		System.out.println("El salario es: " + this.salary *21);
	} //calculateSalary

	//Metodo para calcular salario con dias festivos
	public void calculateSalary(int days, int holidays) {
		holidays +=3;
		System.out.println ((this.salary*holidays) + (this.salary*days));
	}
	

	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", RFC=" + RFC
				+ ", salary=" + salary + "]";
	}// toString

	public static void main(String[] args) {

		

	}// public static void main

}//public class Employee
