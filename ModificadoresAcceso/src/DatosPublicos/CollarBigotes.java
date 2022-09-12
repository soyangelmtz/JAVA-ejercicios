package DatosPublicos;

import DatosPrivados.Bigotes;

public class CollarBigotes {
    public static void main(String[] args) {

        //Constructor por defecto
//        Bigotes.nombre = "Bigotes";
//        Bigotes.edad = 15;
//        Bigotes.colorDePelo = "cafe"
//        Bigotes.numeroBigotes = 30;
//        Bigotes.enfermedades = true;
//        Bigotes.raza = "Siames";
//        Bigotes.vacunas = true;
//        Bigotes.calle = "Moctezuma y Madero";
//        Bigotes.numeroCasa = 105;
//        Bigotes.colonia = "Las Lomas de Santa Anita";
//        Bigotes.numeroTelefono = 5512345678;
//        Bigotes.codigoPostal = 00100;
//        Bigotes.signoZodiacal = "Leo";
//        Bigotes.peso = 12.34d;

        //Constructor manual
        Bigotes Bigotes = new Bigotes ("Bigotes", 15, "cafe", 30, true, "siames", true, "Moctezuma y Madero", 105, "Las Lomas de Santa Anita", "5512345678", 50100, "Leo", 12.34d);

//        System.out.println(Bigotes);
        Bigotes.datosCollarBigotes();
        System.out.println();
        System.out.println(Bigotes.nombre);
//        System.out.println(Bigotes.peso);

        Bigotes.nombre = "Peluche";
        System.out.println(Bigotes);




    }//main
}//CollarBigotes
