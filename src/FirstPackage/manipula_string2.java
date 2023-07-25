package FirstPackage;

public class manipula_string2 {

    public static void main(String[] args) {

        String frase = "Hoy es un estupendo dia para aprender a programar en Java";

        String frase_resumen =frase.substring(29, 57) + " irnos a la playa y olvidarnos de todo...";
        System.out.println(frase_resumen);

        String frase_resumen2 =frase.substring(0, 29) + " irnos a la playa y olvidarnos de todo..." +
             "y " +  frase.substring(29,57);
        System.out.println(frase_resumen2);

          // el metodo substring sirve para extraer los caracteres que queramos.





    }
}
