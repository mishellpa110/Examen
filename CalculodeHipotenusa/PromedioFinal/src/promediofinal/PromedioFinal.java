package promediofinal;
import java.util.Scanner;
public class PromedioFinal {

    public static void main(String[] args) {
         float acum = 1; // Acumulado
        float notas = 0;
        float Aprobado = 60;
        float Reprobado = (59);
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas a promediar");
        float cn = r.nextFloat(); // Cantidad de notas
        while(acum <= cn) {
            System.out.println("Ingrese la nota numero: "+acum );
            float n = r.nextFloat();
            notas += n;
            acum++;
        }
        float promedio = notas / cn;
        System.out.println("El promedio es: "+promedio);
        String acAprobado = null;
        String ap = null;
        System.out.println(acAprobado/ap + "El promedio de nota es aprobada: ");
        System.out.println("El promedio de nota es Reprobado: " + acReprobado / (59 - ap));
        
{
        }
        }
    }
