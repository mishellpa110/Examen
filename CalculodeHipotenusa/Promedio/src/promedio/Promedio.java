package promedio;
import java.util.Scanner;
public class Promedio {
    
    public static void main(String[] args) {
        float acum = 1;
        float notas = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas a promediar");
        float cn = r.nextFloat(); 
        while(acum <= cn)
            System.out.println("Ingrese la nota numero: "+acum );
            float n = r.nextFloat();
            notas += n;
            acum++;
        
        float promedio = notas / cn;
        System.out.println("El promedio es: "+promedio);
       int ap = 0;
       float nota = 0, acAprobado = 0, acReprobado = 0;
       for(int x = 0; x < 60; x++)
           nota = entrada.nextFloat();
           
           if(nota >= 4)
               acAprobado = acAprobado + nota;  
            else acReprobado = acReprobado + nota;   
       
       System.out.println("El promedio de nota es aprobada: " + acAprobado/ap);
       System.out.println("El promedio de nota es Reprobado: " + acReprobado / (60 - ap));
    }
}