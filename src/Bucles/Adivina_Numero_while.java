package Bucles;

import java.util.Scanner;

public class Adivina_Numero_while {

    public static void main(String[] args) {

        int aleatorio = (int)(Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero!=aleatorio){

            intentos++;

            System.out.println("Introduce un numero, por favor");

            numero = entrada.nextInt();

            if (aleatorio < numero){
                System.out.println("el numero es mas bajo");
            }
            else if (aleatorio > numero){
                System.out.println("el numero es mas alto");
            }

        }

        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");


    }
}
