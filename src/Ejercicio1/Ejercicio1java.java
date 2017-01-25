package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x=0;
		x= cambio(x);
		System.out.println("son "+x+ " fahrenheit");

	}
	public static float cambio(float i){
		Scanner aux= new Scanner(System.in);
		System.out.print("Introduzca grados a cambiar: ");
		float C= aux.nextFloat();
		float F;
		F = 32 + ( 9 * C / 5);
		return F;
		
		
		
		
		
	}

}
