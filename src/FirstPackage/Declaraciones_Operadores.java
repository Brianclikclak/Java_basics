package FirstPackage;

public class Declaraciones_Operadores {

    private static void main(String[] args) {

        final double apulgadas = 2.54;

        double cm = 6;

        double resultado = cm/apulgadas;

        System.out.println("En " + cm + "cm hay " + resultado + " pulgadas");

        int operador1, operador2, result;

            operador1 = 5;
            operador2 = 6;
            result = operador1 + operador2;

        System.out.println("operador 1: " + operador1 + " +" + " operador 2: " + operador2 + " = " + result);
    }
}
