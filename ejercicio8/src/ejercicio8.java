
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int posicionx, posiciony;
        byte opc;

        posicionx = (int) (Math.random() * 101);
        posiciony = (int) (Math.random() * 101);

        do {
            System.out.println("Robot está en " + posicionx + "," + posiciony);
            System.out.println("1. Girar al Norte y avanzar 10 pasos");
            System.out.println("2. Girar al Sur y avanzar 20 pasos");
            System.out.println("3. Girar al Este y avanzar 10 pasos");
            System.out.println("4. Girar al Oeste y avanzar 20 pasos");
            System.out.println("5. Salir del programa");
            System.out.println("Cualquier otro número ingresado será incorrecto y le pedirá una nueva opción a ingresar");

            System.out.println("Ingrese la opción");
            opc = entrada.nextByte();

            switch (opc) {

                case (1):
                    posiciony = posiciony + 10;
                    break;
                case (2):
                    posiciony = posiciony - 20;
                    break;
                case (3):
                    posicionx = posicionx + 10;
                    break;
                case (4):
                    posicionx = posicionx - 20;
                    break;
                case (5):
                    System.out.println("Adiós Robot");
                    break;
                default:
                    System.out.println("Opción Incorrecta");

            }
        } while (opc != 5);

    }
}
