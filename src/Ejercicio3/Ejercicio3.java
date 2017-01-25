package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=validacion();
		double v=conversion(n);
		System.out.println(n+" km/h son "+v+"m/s");
		
	}
	public static double conversion(double n){
		
		double k=0;
		k=n;
		double m;
		m= k/3.6;
		return m;
		
	}public static double validacion(){
		Scanner aux= new Scanner(System.in);
		float x=0;
		String num="";
		boolean error=false;
		do{
			System.out.println("Introduzca los km/h: ");
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
