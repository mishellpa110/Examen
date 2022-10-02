package semanauno;

import java.util.Scanner;

public class SemanaUNO {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in); 
        int horasTotales, semanas,dias,horas;
        
        System.out.print("Digite el numero de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
    }
    
}
