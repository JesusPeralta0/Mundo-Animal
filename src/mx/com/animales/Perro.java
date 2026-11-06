package mx.com.animales;

public class Perro extends Animal implements Movible{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(" El perro ladra ");
    }

    @Override
    public void moverse() {
        System.out.println(" Movimiento: Corre ");
    }
}
