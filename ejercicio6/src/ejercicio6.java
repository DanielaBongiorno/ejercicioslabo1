
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        double mayor, monto, anualvel, anuallan, prom;
        String nom, may;
        byte tipo;
        int n;
        anualvel = 0;
        anuallan = 0;
        prom = 0;
        
        mayor = 0;
        may = "";

        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Ingrese el total de barcos:  ");
        n = entrada3.nextInt();

        for (int i = 1; i <= n; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el nombre del barco (Si ingresa 0 se cierra) ");
            nom = entrada.nextLine();

            Scanner entrada1 = new Scanner(System.in);
            System.out.println("Ingrese el tipo de barco (1 velero y 2 lancha  ");
            tipo = entrada1.nextByte();

            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Ingrese el monto abonado mensualmente ");
            monto = entrada2.nextDouble();

            switch (tipo) {

                case (1):
                    anualvel = anualvel + monto;
                    if (monto > mayor) {
                        may = nom;
                        mayor = monto;
                    }
                    break;
                case (2):
                    anuallan = anuallan + monto;
                    break;
                default:
                    System.out.println("Ha ingresado valor incorrecto");

            }
            prom =  ((anualvel + anuallan) / n);
        }
        System.out.println("El total anual aportado por los veleros es de $  " + anualvel);
        System.out.println("El total anual aportado por las lanchas es de $  " + anuallan);
        System.out.println("El nombre del velero que mayor cuota mensual paga es  " + may + ". La cuota es de $  " + mayor);
        System.out.println("El promedio de cuota pagada por todos es de  " + prom);
    
    }

}
