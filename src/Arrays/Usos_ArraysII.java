package Arrays;

import javax.swing.*;

public class Usos_ArraysII {

    public static void main(String[] args) {


        /*String [] paises = new String[8];

        for (int i = 0; i < 8 ; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce un país " + (i+1));
        }

        paises[0] = "España";
        paises[1] = "México";
        paises[2] = "Colombia";
        paises[3] = "Argentina";
        paises[4] = "Perú";
        paises[5] = "Chile";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";

        String [] paises = {"España, México, Colombia, Argentina, Perú, Chile, Ecuador, Venezuela "};
        for(int i = 0; i < paises.length; i++){
            System.out.println("País " + (i+1) + ": " + paises[i]);
        }

        for (String elemento: paises){
            System.out.println("País: " +  elemento);
        }*/

        int[] matriz_aleatorios = new int[150];

        for (int i = 0; i < matriz_aleatorios.length; i++){
            matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
        }

        for (int numeros: matriz_aleatorios){
            System.out.println(numeros);
        }


    }
}
