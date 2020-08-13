
import java.util.Scanner;

public class ejercicio2labo3 {

    public static void main(String[] args) {
        int anio, resto, bis;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el año   ");
        anio = entrada.nextInt();

        resto = anio % 100;
        bis = anio % 400;

        if (bis == 0) {
            if (resto == 0) {
                System.out.println("El año " + anio + "  es bisiesto");
            } 
        }else {
                System.out.println("El año " + anio + "  no es bisiesto");

            }

    }
}