import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaDatos {

    public static void main(String[] args) {
        int dato = solicitarDato();
        System.out.println("El número introducido es: " + dato);
    }

    public static Scanner leer = new Scanner(System.in);

    public static int solicitarDato(){

        int dato = 0; //inicializamos una variable que almacena el numero
        boolean continuar = true; //inicializamos una variable para mantener y terminar
                                // el bucle do-while

        do{

            try{

                System.out.println("Introduce un número entero: ");
                dato = leer.nextInt(); //leemos el número entero
                continuar = false; //si no hay excepción, cambiamos el valor de continuar

            }catch(InputMismatchException e){

                System.out.println("Error: Debes introducir un número entero.");
                System.out.println("Exception: " + e);
                leer.nextLine();//limpia el espacio de memoria donde esta ubicada la excepción
                                // (dato ingresado incorrectamente)
            }

        }while(continuar);

        return dato;
    }
}
