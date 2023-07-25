package Bucles;

import javax.swing.*;

public class Login_while {

    public static void main(String[] args) {


        String Usuario = "Brian";

        String Password = "";

        while (Usuario.equals(Password) == false) {

            Password = JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            if (Usuario.equals(Password) == false) {
                System.out.println("La contraseña es incorrecta");
            }

        }

        System.out.println("Contraseña correcta. Acceso permitido");
        
    }
}