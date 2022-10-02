package swicht.ejercicio.pkg4;

import java.util.Scanner;

public class SwichtEjercicio4 {

    
    public static void main(String[] args) {
        
        String letra;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Ingrese una letra : ");
        letra = ingreso.next();
        switch(letra){
            case "a": System.out.println("La letra ingresada es una vocal"); break;
            case "e": System.out.println("La letra ingresada es una vocal"); break;
            case "i": System.out.println("La letra ingresada es una vocal"); break;
            case "o": System.out.println("La letra ingresada es una vocal"); break;
            case "u": System.out.println("La letra ingresada es una vocal"); break;
            default : System.out.println("La letra ingresada es una consonante");
        }
    } 
}


    
    

