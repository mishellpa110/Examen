
package prograsemana5;

import java.util.Scanner;

public class Prograsemana5 {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, Examenfinal, notaFinal;
        
        //pedir los datos necesarios
        System.out.println("digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("digite la primera nota del examen parcial: ");
        primerExamen = entrada.nextFloat(); 
        System.out.println("digite la segunda nota del examen parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("digite la nota del examen final: ");
        Examenfinal = entrada.nextFloat();
        
        //sacamos los calculos
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        Examenfinal *= 0.40f;
        
        //sumamos las notas
        notaFinal = participacion + primerExamen + segundoExamen + Examenfinal;
        
        //imprimir resultado en pantalla
        System.out.println("\nla nota final es: "+notaFinal);
                
               
    }
    
}
