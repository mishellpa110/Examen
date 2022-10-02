
package camisas;

import java.util.Scanner;

public class Camisas {

    public static void main(String[] args) {
        float precio = 5;
        
        Scanner scan = new Scanner (System.in);
          System.out.print ("Introduzca el numero de camisas: ");
        int num = scan.nextInt ();
        
        if (num < 3)
            System.out.println ("El precio a pagar de las camisas son: " + 0.9 * num * precio);
        else
            System.out.println ("El precio a pagar de las camisas son: " + 0.8 * num * precio);
    }   
}
