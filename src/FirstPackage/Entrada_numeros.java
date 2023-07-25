package FirstPackage;


import javax.swing.*;

public class Entrada_numeros {

    public static void main(String[] args) {

        /*double x = 10000.0;
        System.out.print(x/3);

        System.out.printf("%1.2f" , x/3);*/
// el metodo "%1.2f" la segunda posicion es la cantidad de deciamles que va a devolver
        String num1 = JOptionPane.showInputDialog("Introduce tu numero");

        double num2 = Double.parseDouble(num1);
        num2 = Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");

        System.out.printf("%1.2f" , Math.sqrt(num2));

    }
}
