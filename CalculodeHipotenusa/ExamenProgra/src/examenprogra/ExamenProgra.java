package examenprogra;

import java.util.Scanner;

public class ExamenProgra {
   public static void main(String[] args) {
        double c;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un cateto");
        double a=sc.nextDouble();  
        System.out.println("ingrese el otro cateto");
        double b=sc.nextDouble(); 
        c=Math.sqrt((a*a+b*b));
        System.out.println(c);                
     }
}

