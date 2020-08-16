package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Ejercicio7 {

    public static int abs(int x) {
        return x > 0 ? x : -x;

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x, y, distx, disty, c, n, cont1, cont2, dx, dy, siy, six;
        distx = disty = six = siy = 0;
        c = cont1 = cont2 = 0;

        System.out.println("Ingrese cantidad de puntos del plano a cargar");
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {

            c = c + 1;
            System.out.println("Ingrese el valor " + c + " de x");
            x = entrada.nextInt();
            System.out.println("Ingrese el valor " + c + " de y");
            y = entrada.nextInt();

            if (x > 0 && y > 0) {

                cont1 = cont1 + 1;
            }
            if (x < 0 && y > 0) {

                cont2 = cont2 + 1;

            }
            dx = abs(x);
            dy = abs(y);
            if (dx > distx) {
                distx = dx;
                six = x;
            }
            if (dy > disty) {
                disty = dy;
                siy = y;

            }

        }

        System.out.println("En el primer cuadrante se encuentran: " + cont1 + " puntos");
        System.out.println("En el tercer cuadrante se encuentran: " + cont2 + " puntos");
        System.out.println("El punto a mayor distancia del origen de coordenadas :(" + six + " ; " + siy + ")");
    }
}
