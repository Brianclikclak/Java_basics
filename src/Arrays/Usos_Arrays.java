package Arrays;

public class Usos_Arrays {

    public static void main(String[] args) {


        int [] mi_matriz = new int[5];
        /*int mi_matriz[] = new int [5];*/

        mi_matriz[0] = 5;
        mi_matriz[1] = 38;
        mi_matriz[2] = -15;
        mi_matriz[3] = 92;
        mi_matriz[4] = 71;

        /*System.out.println(mi_matriz[0]);
        System.out.println(mi_matriz[1]);
        System.out.println(mi_matriz[2]);
        System.out.println(mi_matriz[3]);
        System.out.println(mi_matriz[4]);*/



        for (int i = 0; i < 5; i++){
            System.out.println( "Valor del indice " + i + " = " + mi_matriz[i]);
        }

        int [] mi_matriz2 = {5, 38, -15, 92, 71, 20, -58, 42, 88, 97, 12}; // Otra forma de declarar Arrays.

        for (int i = 0; i < mi_matriz2.length; i++){
            System.out.println("Valor del indice " + i + " = " + mi_matriz2[i]);
        }
    }
}
