package FirstPackage;

public class Variables {
    public static void main(String[] args) {

        byte edad;
        edad = 35;
        edad = 75; // Como es una "variable" puede cambiar su valor.
//   or int = 35;   Diferentes modos de declarar variables de tipo integral.
        short age;
        age = 35;
//   or int edad = 35; Asi se declaran las variables en la misma linea.

        System.out.println(edad);

        edad = 50;
        System.out.println(edad);

        final double a_pulgadas = 2.54;
        // "final" es la forma de declarar una constante o const en js.
        // "double"  es el tipo de dato.
        // "a_pulgadas" es el nombre de la constante.
    }
}