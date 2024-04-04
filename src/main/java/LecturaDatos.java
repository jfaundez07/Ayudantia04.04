import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaDatos {

    public static void main(String[] args) {
        stringToIng("a");
        System.out.println("no se cayo");
    }

    public static Scanner leer = new Scanner(System.in);

    public static int leerEntero() {
        try{
            //lo que yo espero que haga
            return leer.nextInt();
        }catch (InputMismatchException e) {
            //lo que debe ocurrir en caso de que falle
            System.out.println("Tipo de dato incorrecto");
        } //expecion que quier encapsular

        return 0;
    }

    public static String leerString() { //no requiere manejo de excepcion.
        return leer.next();
    }

   public static int stringToIng(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Tipo de dato incorrecto, expecion: " + e.getMessage());
        }
        return 0;
    }
    // NumberFormatException


}
