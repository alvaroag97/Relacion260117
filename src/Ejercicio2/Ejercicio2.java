package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double L, A, radio = 0;
		
		radio = validacion();
		
		L= Longitud(radio);
		System.out.println("La longitudes "+L);
		A= Area(radio);
		System.out.println("El area es "+A);

	}
	public static double Longitud(double x){
		
		double R=0;
		R=x;
		double L;
	
		L= 2*Math.PI*R;
		
		return L;
	}
	public static double Area(double y){
		double R=0;
		R=y;
		double A;
		A= Math.PI*(R+R);
		return A;
		
	}
	public static float validacion(){
		Scanner aux= new Scanner(System.in);
		float x=0;
		String num="";
		boolean error=false;
		do{
			System.out.println("Introduzca el radio: ");
			num= aux.nextLine();
			try{
				x= Integer.parseInt(num);
				error=true;
			}catch(Exception e){
				System.out.println("has introducido un numero mal");
				error=false;
			}
		}while(!error);
		return x;
	}

}
