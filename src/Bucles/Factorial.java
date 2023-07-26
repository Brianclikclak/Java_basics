package Bucles;

import javax.swing.*;

public class Factorial {

    public static void main(String[] args) {


        long resultado = 1l;

        long numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        for (long i = numero; i > 0 ; i--){

            resultado = resultado*i;
        }

        System.out.println("El factorial de " + numero + " es " + resultado);

    }
}
