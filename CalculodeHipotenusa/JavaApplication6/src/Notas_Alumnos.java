import java.util.*;

public class Notas_Alumnos {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] nombre = new String[10];
		int[] nota1 = new int[10];
		int[] nota2 = new int[10];
		int[] nota3 = new int[10];
		int[] nota4 = new int[10];
		int[] nota5 = new int[10];
		int x=0,y,z,resp1 = 0;
		String resp2;
		do{
			
			do{
			System.out.print("Ingrese el nombre del alumno "+(x+1)+": ");
			
			System.out.print("Ingrese la nota 1 del alumno "+(x+1)+": ");
			nota1[x] = s.nextInt();
			System.out.print("Ingrese la nota 2 del alumno "+(x+1)+": ");
			nota2[x] = s.nextInt();
			System.out.print("Ingrese la nota 3 del alumno "+(x+1)+": ");
			nota3[x] = s.nextInt();
			System.out.print("Ingrese la nota 4 del alumno "+(x+1)+": ");
			nota4[x] = s.nextInt();
			System.out.print("Ingrese la nota 5 del alumno "+(x+1)+": ");
			nota5[x] = s.nextInt();
			x++;
			do{
			System.out.println("¿Desea registrar otro alumno?");
			System.out.println("1 - si");
			System.out.println("2 - no");
			}while(resp1<1||resp1>2);
			resp1 = s.nextInt();
			}while(resp1==1);
		}
		
                   }