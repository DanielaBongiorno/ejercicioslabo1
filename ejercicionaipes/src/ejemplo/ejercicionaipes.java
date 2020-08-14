
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ejercicionaipes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int carta, carta2, totales, cartamayor, cartatotal, cartatotal1, i;
        cartatotal1 = 0;
        carta = 0;
        carta2 = 0;
        cartatotal = 0;
        totales = 0;
        int palo, palo2;
        String basto, oro, espada, copa, palos, palos2;
        palos = " ";
        palos2 = " ";

        for (i = 1; i < 3; i++) {

            palo = (int) (Math.random() * 4 + 1);
            carta = (int) (Math.random() * 12 + 1);
            palo2 = (int) (Math.random() * 4 + 1);
            carta2 = (int) (Math.random() * 12 + 1);

            switch (palo) {
                case (1):
                    palos = "Basto";
                    break;
                case (2):
                    palos = "Copa";
                    break;
                case (3):
                    palos = "Espada";
                    break;
                case (4):
                    palos = "Oro";
                    break;
            }

            switch (palo2) {

                case (1):
                    palos2 = "Basto";
                    break;
                case (2):
                    palos2 = "Copa";
                    break;
                case (3):
                    palos2 = "Espada";
                    break;
                case (4):
                    palos2 = "Oro";
                    break;
            }

            System.out.println("La carta tiene un valor de  " + carta + " y el palo es  " + palos);
            System.out.println("La carta tiene un valor de  " + carta2 + " y el palo es  " + palos2);

            if (carta > carta2) {

                cartatotal = carta + carta2;
                System.out.println("El jugador ganador de la ronda " + i + " ganó por un valor de:   " + cartatotal);

            } else if (carta < carta2) {

                cartatotal1 = carta + carta2;
                System.out.println("El jugador ganador de la ronda " + i + " ganó por un valor de:   " + cartatotal1);

            } else if (carta == carta2) {
                if (palo == 4) {
                    cartatotal = carta + carta2;
                    System.out.println("El jugador ganador de la ronda " + i + " ganó por un valor de:   " + cartatotal);

                } else if (palo2 == 4) {
                    cartatotal1 = carta + carta2;
                    System.out.println("El jugador ganador de la ronda " + i + " ganó por un valor de:   " + cartatotal1);
                } else {
                    System.out.println("Hubo empate");
                }

            }

        }
        if (cartatotal > cartatotal1) {
            System.out.println("El ganador del juego ganó por   " + cartatotal);

        } else if (cartatotal < cartatotal1) {

            System.out.println("El ganador del juego ganó por   " + cartatotal1);
        } else if (cartatotal == cartatotal1) {
            System.out.println("Hubo empate");

        }

    }

}
