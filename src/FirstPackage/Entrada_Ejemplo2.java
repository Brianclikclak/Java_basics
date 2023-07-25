package FirstPackage;
import javax.swing.*;

public class Entrada_Ejemplo2 {

    public static void main(String[] args) {


        String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edad = JOptionPane.showInputDialog("introduce tu edad, por favor");

        int edad_usuario = Integer.parseInt(edad);

        edad_usuario++;

        System.out.println("Hola " + Nombre_usuario + ", Que tal? por lo visto el año que viene tendras " + edad_usuario + " años de edad.");
    }
}
