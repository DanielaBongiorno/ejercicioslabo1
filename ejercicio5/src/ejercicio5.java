
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ejercicio5 {

    public static void main(String[] args) {

        int num, par, impar;
        par = impar = 0;
        String verdadero;
        verdadero = "";
      
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número ");
        num = entrada.nextInt();

        while (num >= 0) {

            if (num % 2 == 0) {

                par = par + 1;

            } else {
                impar = impar + 1;
            }
            if (num == 0) {

                verdadero = "SI";
            }else
                verdadero = "NO";
            System.out.println("Ingrese el número ");
            num = entrada.nextInt();
        }
       System.out.println("La cantidad de pares es de  " +par);
       System.out.println("La cantidad de impares es de  " +impar);
       System.out.println("¿Pasó al menos un cero?  " +verdadero);
        
    }
}
