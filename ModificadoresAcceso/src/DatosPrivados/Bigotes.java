package DatosPrivados;

public class Bigotes {
    /*
    Orden oara crear clases y objetos

    1.- Definir atrivutos de la clase
    2.- Cosntructores
    3.- Metodos
    4.- toString para poder visualizar la info
     */

    //Atributos
    public String nombre;
    public int edad;
    private String colorDePelo;
    private int numeroBigotes;
    public boolean enfermedades;
    private String raza;
    private boolean vacunas;
    private String calle;
    private int numeroCasa;
    private String colonia;
    public String numeroTelefono;
    private int codigoPostal;
    public String signoZodiacal;
    private double peso;

    //Constructor


    public Bigotes(String nombre, int edad, String colorDePelo, int numeroBigotes, boolean enfermedades, String raza, boolean vacunas, String calle, int numeroCasa, String colonia, String numeroTelefono, int codigoPostal, String signoZodiacal, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorDePelo = colorDePelo;
        this.numeroBigotes = numeroBigotes;
        this.enfermedades = enfermedades;
        this.raza = raza;
        this.vacunas = vacunas;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.colonia = colonia;
        this.numeroTelefono = numeroTelefono;
        this.codigoPostal = codigoPostal;
        this.signoZodiacal = signoZodiacal;
        this.peso = peso;
    }//Constructor

    @Override
    public String toString() {
        return "Bigotes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", colorDePelo='" + colorDePelo + '\'' +
                ", numeroBigotes=" + numeroBigotes +
                ", enfermedades=" + enfermedades +
                ", raza='" + raza + '\'' +
                ", vacunas=" + vacunas +
                ", calle='" + calle + '\'' +
                ", numeroCasa=" + numeroCasa +
                ", colonia='" + colonia + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", codigoPostal=" + codigoPostal +
                ", signoZodiacal='" + signoZodiacal + '\'' +
                ", peso=" + peso +
                '}';
    }//toString

    //Metodo
     public void datosCollarBigotes() {
    		System.out.println("El nombre es: " + this.nombre);
    		System.out.println("La edad es: " + this.edad + " años");
    		System.out.println("Su color de pelo es: " + this.colorDePelo);
    		System.out.println("Tiene " + this.numeroBigotes + " bigotes");
    		System.out.println("Tiene enfermedades?: " + this.enfermedades);
    		System.out.println("Este gato es de raza: " + this.raza);
    		System.out.println("Tiene sus vacunas?: " + this.vacunas);
    		System.out.println("Vive en la calle: " + this.calle);
    		System.out.println("Numero de casa: " + this.numeroCasa);
    		System.out.println("En la colonia: " + this.colonia);
    		System.out.println("Numero de telefono: " + this.numeroTelefono);
    		System.out.println("Codigo Postal: " + this.codigoPostal);
    		System.out.println("Signo Zodiacal: " + this.signoZodiacal);
    		System.out.println("Pesa: " + this.peso + " kilogramos");
    	}//datosCollarBigotes
} //Bigotes
