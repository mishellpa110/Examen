import java.awt.*;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Math;
 
 
 class EcuacionCuadratica {
 
	public double calcularDiscriminante(double a, double b, double c) throws ExcepcionNegativo {
		return Math.pow(b, 2)-4*a*c;
	}
	public double comprobarDivisible(double a) throws ExcepcionNegativo {
		return a;
	}
	public double calcularUnSigno(double a, double b, double c) throws ExcepcionNegativo{
		return (-b+Math.sqrt(calcularDiscriminante(a, b, c)))/(2*a);
	}
	public double calcularOtroSigno(double a, double b, double c) throws ExcepcionNegativo{
		return (-b-Math.sqrt(calcularDiscriminante(a, b, c)))/(2*a);
	}
 
}
 
 class ExcepcionNegativo extends Exception {
 
	private static final long serialVersionUID = 1L;
 
	public ExcepcionNegativo(){
		super();
	}
	public ExcepcionNegativo(String msg){
		super(msg);
	}
}
 
 class Menu {
 
	static Scanner sc = new Scanner(System.in);
 
	public static int opcion(){
		int opcion=0;
		boolean error=true;
		while(error){
			try {
				opcion=Integer.parseInt(sc.nextLine());
				error=false;
			} catch (Exception e) {
				System.err.println("Error. Número no válido: "+ e.getMessage());
			}
		}
		return opcion;
	}
 
	public static double pedirNumero(){
		double opcion=0.;
		boolean error=true;
		while(error){
			try {
				opcion=Double.parseDouble(sc.nextLine());
				error=false;
			} catch (Exception e) {
				System.err.println("Error. Número no válido: "+ e.getMessage());
			}
		}
		return opcion;
	}
}