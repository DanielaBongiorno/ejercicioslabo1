package ejemplo;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        String art;
        byte clave;
        float precio, prdto;
        prdto = 0;
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrse su articulo");
        art = entrada2.nextLine();
        
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrse el precio original");
        precio = entrada1.nextFloat();
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la clave [1 o 2]   ");
        clave = entrada.nextByte();

        switch (clave) {

            case (1):
                prdto = precio - (precio * 20 / 100);
                
                System.out.println("El artículo ingresado es  " + art);
                System.out.println("La clave ingresada es  " + clave);
                System.out.println("El precio original es de $  " + precio);
                System.out.println("El precio con descuento es de $  " + prdto);
                break;

            case (2):
                prdto = precio - (precio * 10 / 100);
                
                System.out.println("El artículo ingresado es  " + art);
                System.out.println("La clave ingresada es  " + clave);
                System.out.println("El precio original es de $  " + precio);
                System.out.println("El precio con descuento es de $  " + prdto);
                break;

            default:
                System.out.println("La clave ingresada es incorrecta");
                break;
        }

    }

}
