

public abstract class Doctor {

    //atributos
    String nombre;

    //metodo para atender a un paciente
    public void atenderPaciente() {

    }//tratarPaciente

}//clase Doctor

//////////////////////////////////////////////////////////

class Pediatra extends Doctor {
    @Override
    public void atenderPaciente() {
        System.out.println("El Pediatra te regala una paleta");
    }// metodo atenderPaciente del pediatra

}//clase Pediatra

///////////////////////////////////////////////////////////



class Cardiologo extends Doctor{
    @Override
    public void atenderPaciente() {
       System.out.println("El cardiologo nos coloca muchos cables en nuestro corazoncito");
    }
}//clase Cardiologo

///////////////////////////////////////////////////////////




class Nutriologa extends Doctor{
    @Override
    public void atenderPaciente() {
        System.out.println("La nutriologa nos regania por tomar Coquita");
    }
}//clase Nutriologa

///////////////////////////////////////////////////

class testDoctores{
    public static void main(String args []){

        //No podemos instanciar objetos de la clase abstracta (No puedo crear "Doctores", puedo crear "Nutriologas, Cardiologos, Pediatras" etc)
        Cardiologo Felipe = new Cardiologo ();
        Felipe.atenderPaciente();

        Pediatra Fernanda = new Pediatra();
        Fernanda.atenderPaciente();

        Nutriologa Mariana = new Nutriologa();
        Mariana.atenderPaciente();
    }//main
}//testDoctores