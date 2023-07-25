package FirstPackage;

import java.util.Scanner;

public class Entrada_ejemplo1 {

    public static void main(String[] args) {
// Scanner: es una clase proporcionada por java dentro del paquete java.util
// entrada: es el nombre de la variable que estamos declarando para almacenar una instancia de la clase Scanner
// new: es una palabra clave de java que se utiliza para crear un nuevo objeto de la clase Scanner
// Scanner: es un metodo espcial llamado constructor que se ejecuta cuando se crea un objeto
// System.in : es el argumento o parametro del contructor Scanner.
// El argumento o paramtro es System.in
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce tu edad, por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años.");

    }
}
