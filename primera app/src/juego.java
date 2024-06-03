import java.util.Scanner;

public class juego {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);    
        String palabrasecreta = "inteligencia";
        int intmax = 10;
        int inte = 0;
        boolean palabraadivinada = false;

        char[] letrasadivinadas = new char[palabrasecreta.length()];
        
        for (int i = 0; i < letrasadivinadas.length; i++) {
            letrasadivinadas[i] = '_';
        }

        while (!palabraadivinada && inte < intmax) {
            System.out.println("palabra a adivinar: " + String.valueOf(letrasadivinadas) + " (" + palabrasecreta.length() + " Letras)");
            System.out.println("Introduce una letra porfa ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letracorrecta = false;

            for (int j = 0; j < palabrasecreta.length(); j++) {

                if (palabrasecreta.charAt(j) == letra) {

                    letrasadivinadas[j] = letra;
                    letracorrecta = true;
                }
            }

            if (!letracorrecta) {
                inte++;
                System.out.println("Incorrecto te quedan " + (intmax - inte) + " intentos.");;;
            }

            if (String.valueOf(letrasadivinadas).equals(palabrasecreta)) {

                palabraadivinada = true;
                System.out.println("Felicidades palabra acertada! g" + palabrasecreta);
                
            }
        }

        if (!palabraadivinada) {
            System.out.println("Que mongolico! te quedaste sin intentos! ");
        }

        scanner.close();
    }
}
