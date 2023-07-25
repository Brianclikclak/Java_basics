package FirstPackage;

public class Calculos_conMath {

    public static void main(String[] args) {

        double raiz = Math.sqrt(9);

        System.out.println(raiz);

        double num1 = 5.85;

        int resultado = (int)Math.round(num1); // al ser un num1 un double, y queremos devolver un entero
                                               // hay que usar una refundicion (int) delante de Math en este caso
        System.out.println(resultado);

        double base = 5;

        double exponente = 3;

        int result = (int) Math.pow(base, exponente); // cambiar el tipo de dato de int a double o usar la refundicion
        System.out.println(result);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + result);
    }
}
