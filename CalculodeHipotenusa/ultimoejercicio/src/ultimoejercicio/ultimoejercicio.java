package ultimoejercicio;
import java.util.Scanner;

public class  ultimoejercicio {

 public static void main(String[] args) {
     try (Scanner teclado = new Scanner(System.in)) {
         float a,b,c,d;
         System.out.println("Indicame el primer numero");
         a=teclado.nextFloat();
         System.out.println("Indicame el segundo numero");
         b=teclado.nextFloat();
         c=a+b;
         d=c*c;
         System.out.println("El cuadrado de la suma de los numeros introducidos es "+d);
     } 
 }
}

    
    

    

