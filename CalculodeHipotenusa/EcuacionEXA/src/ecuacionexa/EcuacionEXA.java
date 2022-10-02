package EcuacionEXA;

import java.util.Scanner;

public class EcuacionEXA {

    
    public static void main(String[] args) {
          
	   Scanner form = new Scanner(System.in);
 
          System.out.println("\nFÃ³rmula CuadrÃ¡tica");
 
	   double a, b, c, x1, x2, potencia, raiz = 0 ;
 
	   System.out.println("\nEscriba el primer numero ");
	   a = form.nextDouble();
 
	   System.out.println("\nEscriba el segundo numero ");
	   b = form.nextDouble();
 
	   System.out.println("\nEscriba el tercer numero ");
	   c = form.nextDouble();
 
	   potencia = Math.pow(b,2) - (4 * a *c);
 
           x1 = (-b - Math.sqrt(potencia)/ 2*a);
 
	   x2 = (-b + Math.sqrt(potencia)/ 2*a);
 
	   System.out.println("\nX1 = " + x1);
	   System.out.println("\nX2 = " + x2);
     }
 
}
   
    
