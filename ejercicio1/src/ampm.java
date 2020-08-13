
import java.util.Scanner;

public class ampm {

    public static void main(String[] args) {
        int hora, minuto;
        String p;

        Scanner entrada = new Scanner(System.in);
        //Entrada de datos:
        System.out.println("Ingrese la hora   ");
        hora = entrada.nextInt();
        System.out.println("Ingrese los minutos   ");
        minuto = entrada.nextInt();
        if (hora > 24) {
            System.out.println("Ha ingresado un valor incorrecto");
        } else {
            if (minuto > 60) {

                System.out.println("Ha ingresado un valor incorrecto");
            } else {

                if (hora > 12) {
                    hora = (hora - 12);

                    p = "PM";
                } else {
                    p = "AM";
                }

                System.out.println("La hora formato 12 es:  " + hora + ":" + minuto + " " + p);

            }
        }
