
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c, x1,x2;

        System.out.println("Ingrese los valores de la ecuación:");
        System.out.print("Ingresa valor de a: ");
        a = entrada.nextInt();
        System.out.print("Ingresa valor de b: ");
        b = entrada.nextInt();
        System.out.print("Ingresa valor de c: ");
        c= entrada.nextInt();

       
        x1 = (int) ((-b) + ((Math.pow(b,2)) - (4*a*c))) / (2*a);
        x2 = (int) ((-b) - ((Math.pow(b,2)) - (4*a*c))) / (2*a);

        System.out.println("Raiz x1 = " + x1);
        System.out.println("Raiz x2 = " + x2);
    }
    
}
