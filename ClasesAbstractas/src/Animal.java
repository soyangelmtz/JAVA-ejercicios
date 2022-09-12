/*
    Crear una clase abstracta llamada Animal
	- Tener 2 metodos abstractos: desplazarse y hacer sonidos.

    - Instanciar 5 animales distintos, que hereden de la clase abstracta llamada Animal
	- Cada animal, debe tener esos 2 metodos. (sysout con la informacion).


    Revisión de repositorio el día Viernes 2 de Septiembre al finalizar el día. (11:59 pm).

 */

public abstract class Animal {
    //atributos
    String nombre;

    //metodo para que un animal emita un sonido
    public void emitirSonido() {
    }//emitirSonido

    public void desplazarse() {
    }//desplazarse

}//classAnimal

////////////////////////////////////////////////////////

class Oso extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El Oso te ruge porque encontraste su madriguera");
    }//metodo emitirSonido

    @Override
    public void desplazarse() {
        System.out.println("El Oso empieza a desplazarse a gran velocidad hacia ti, corre D:");
    }//metodo desplazarse
}//class Oso

////////////////////////////////////////////////////////

class Caballo extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El caballo relincha de felicidad");
    }//metodo emitirSonido

    @Override
    public void desplazarse() {
        System.out.println("El caballo cabalga rapidamente");
    }//metodo desplazarse
}//class Caballo

///////////////////////////////////////////////////////////

class Delfin extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El delfin hace sonidos de delfin (no se como se llama su sonido)");
    }//metodo emitirSonido

    @Override
    public void desplazarse() {
        System.out.println("El delfin nada y salta alegremente en el agua");
    }//metodo desplazarse
}//class Delfin

/////////////////////////////////////////////////////////

class Gorila extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El gorila grita ferozmente porque te comiste su banana D:");
    }//metodo emitirSonido

    @Override
    public void desplazarse() {
        System.out.println("El gorila comienza a correr en cuatro patas para alcanzar su racimo de bananas");
    }//metodo desplazarse
}//class Gorila

//////////////////////////////////////////////////////

class Tardigrado extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El tardigrado hace sus sonidos de tardigrado, que emocionante");
    }//metodo emitirSonido

    @Override
    public void desplazarse() {
        System.out.println("El tardigrado se desplaza rapidamente a 9.1 micrometros por hora, porque trae prisa");
    }//metodo desplazarse
}//class Tardigrado

//////////////////////////////////////////////////////////

class testAnimales {
    public static void main(String args []){

        Oso Grizzly = new Oso();
        Grizzly.emitirSonido();
        Grizzly.desplazarse();

        Caballo Spirit = new Caballo();
        Spirit.emitirSonido();
        Spirit.desplazarse();

        Delfin Matias = new Delfin();
        Matias.emitirSonido();
        Matias.desplazarse();

        Gorila silverBack = new Gorila();
        silverBack.emitirSonido();
        silverBack.desplazarse();

        Tardigrado Pancracio = new Tardigrado();
        Pancracio.emitirSonido();
        Pancracio.desplazarse();

    }//main
}//class testAnimales