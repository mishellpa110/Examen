package progra8;

import java.util.Scanner;

public class Progra8 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       double a, b, c, delta, sol1, sol2;
       
        System.out.println("Programa Formula CuadrÃ¡tica");
        System.out.println("Digite el valor de A:");
        a = entrada.nextDouble();
        
        if (a == 0){
            System.out.println("Cero no es valor posible para A");
        }else{
           
        System.out.println("Digite el valor de B:");
        b = entrada.nextDouble();
        System.out.println("Digite el valor de C:");
        c = entrada.nextDouble();
        
        delta = (b*b) - (4*a*c);
        System.out.println("Delta: "+delta);
        
        if (delta<0){
            System.out.println("Su ecuaciÃ³n no tiene soluciÃ³n en los Reales");
           
        }else if (delta == 0){
            
            sol1 = -b/(2*a);
            
            System.out.println("Su ecuaciÃ³n tiene un soluciÃ³n en los Reales");
            System.out.println("SoluciÃ³n: "+sol1);
            
        }else{
            sol1 = (- b + Math.sqrt(delta))/(2*a);
            sol2 = (- b - Math.sqrt(delta))/(2*a);
            System.out.println("Su ecuaciÃ³n tiene 2 soluciones en los Reales.");
            System.out.println("Solucion 1: "+sol1);
            System.out.println("Solucion 2: "+sol2);
 
       
        }
    
       }
      }
    }
    
    


    
    

