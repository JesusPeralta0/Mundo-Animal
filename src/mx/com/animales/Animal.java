package mx.com.animales;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarInformacion() {
        System.out.print("Nombre: " + nombre + " | Edad: " + edad);
    }
    public abstract void hacerSonido();
    }
