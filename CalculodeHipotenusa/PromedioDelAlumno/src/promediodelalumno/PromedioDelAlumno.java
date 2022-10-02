
package promediodelalumno;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PromedioDelAlumno {

    public static void main(String[] args) {
        float acum = 1; 
        float notas = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas a promediar");
        float cn = r.nextFloat();
         {
            System.out.println("Ingrese la nota numero: "+acum );
            float n = r.nextFloat();
            notas += n;
            acum++;
        }
        float promedio = notas / cn;
        System.out.println("El promedio es: "+promedio);
         
        int nota = 60;
        nota = Interqer.parseInt(JOptionPane.showInputDialog(" Ingrese el promedio"));
        if (notas >= promedio) {
            JOptionPane.showMessageDialog(null, "El alumno perdio el curso");
        }else {
            JOptionPane.showMessageDialog(null, "El alumno gano el curso");
        }
    }
}
