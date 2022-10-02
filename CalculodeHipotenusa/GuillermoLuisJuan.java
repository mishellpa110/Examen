package guillermo.luis.juan;

import java.util.Scanner;

public class GuillermoLuisJuan {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
  
  float guillermo,luis,juan,total;
  
  System.out.println("digite la cantidad de dinero que tiene Guillermo");
   guillermo = entrada.nextFloat();
   
   luis = guillermo/2; //luis tiene la mitad de lo de guillermo
   juan = (guillermo+luis)/2;
   
   total = guillermo+luis+juan;
   
   System.out.println("\nla cantidad de dinero entre los tres es :"+total);
    }
    
}
