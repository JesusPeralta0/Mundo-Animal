# MundoAnimal

Aplicación en Java que muestra información de distintos animales, su sonido y
su forma de desplazarse. Aplica herencia, sobrescritura, polimorfismo, una
clase abstracta y una interfaz.

## Estructura

```
Mundo-Animal/
├── src/mx/com/animales/
│   ├── Animal.java    (clase abstracta base)
│   ├── Perro.java
│   ├── Gato.java
│   ├── Vaca.java
│   ├── Caballo.java   (reto extra)
│   ├── Movible.java   (interfaz)
│   └── Main.java
├── .gitignore
└── README.md
```

## Cómo ejecutar

1. Clonar el repositorio:
   `git clone https://github.com/JesusPeralta0/Mundo-Animal.git`
2. Abrir la carpeta en IntelliJ IDEA con JDK 17 o superior.
3. Ejecutar la clase `Main` (`Shift+F10`).

## Ejemplo de salida

```
Nombre: Max | Edad: 3 | Sonido: Guau | Movimiento: Corre
Nombre: Luna | Edad: 2 | Sonido: Miau | Movimiento: Camina
Nombre: Lola | Edad: 5 | Sonido: Muuu | Movimiento: Camina
Nombre: Rayo | Edad: 7 | Sonido: Relincho | Movimiento: Galopa
```

## Preguntas de reflexión

### 1. ¿Puedes crear un objeto directamente de Animal? ¿Por qué?

No. `Animal` es una clase abstracta y Java no permite instanciarlas. Tiene un
método sin implementación (`hacerSonido()`) y no representa un animal
concreto, por lo que solo sirve como molde para las clases hijas.

### 2. ¿Qué propiedades se comparten y qué comportamiento cambia entre Perro, Gato y Vaca?

Se comparten los atributos `nombre` y `edad`, el constructor y el método
`mostrarInformacion()`, todos heredados de `Animal`. Lo que cambia es el
comportamiento de `hacerSonido()` y `moverse()`, porque cada clase hija los
implementa a su manera.

### 3. ¿Cuál es la diferencia entre extends e implements?

`extends` se usa para heredar de una clase: la hija recibe los atributos y
métodos ya hechos, y en Java solo se puede extender de una clase.
`implements` se usa para cumplir un contrato (una interfaz): la clase está
obligada a escribir los métodos declarados, y puede implementar varias
interfaces a la vez.

### 4. ¿Qué es el polimorfismo y cómo se aplicó en este proyecto?

Es la capacidad de que una variable de un tipo general (`Animal`) pueda
referirse a objetos de distintas clases hijas y que, al llamar un método, se
ejecute la versión propia de cada objeto. En `Main` se guardan un `Perro`, un
`Gato` y una `Vaca` en un `Animal[]` y, con un solo ciclo, cada uno responde
con su propio sonido sin usar `if/else`.

### 5. ¿Qué ventaja tuvo agregar la clase Caballo?

Para agregar `Caballo` solo se creó la nueva clase y se añadió un elemento al
arreglo. El ciclo de `Main` no se modificó. Esto muestra que el código es
fácil de extender: se pueden sumar más animales sin cambiar la lógica
existente.