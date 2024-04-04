import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaDatos {

    public static void main(String[] args) {
        System.out.println("Ingrese un entero: ");
        int entero = leerEntero();
        System.out.println("No se cayo el programa");
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

    public static String leerString() {
        return leer.next();
    }

   // public static int stringToIng(String texto) {
     //   return //string en entero;
    //}

}
