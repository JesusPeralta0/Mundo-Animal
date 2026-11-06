package mx.com.animales;

public class Vaca extends Animal implements Movible{
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(" La vaca hace muuuuu" );
    }

    @Override
    public void moverse() {
        System.out.println(" Movimiento: camina");

    }
}
