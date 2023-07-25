package FirstPackage;

public class manipula_strings {

    public static void main(String[] args) {

        String nombre = "Brian";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("mi nombre tiene " + nombre.length() + " letras");

        System.out.println( "La primera letra de " + nombre + " es la " + nombre.charAt(0));

        int ultima_letra;

        ultima_letra = nombre.length();

        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));

        System.out.println(ultima_letra);
    }
}
