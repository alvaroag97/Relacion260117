package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = 0;
		x = cambio(x);
		System.out.println("son " + x + "º fahrenheit");

	}

	public static float cambio(float i) {
		float C = 0;
		C = validacion(C);

		float F;
		F = 32 + (9 * C / 5);
		return F;

	}

	public static float validacion(float v) {
		String x = "";
		boolean error = false;
		float n = 0;
		Scanner aux = new Scanner(System.in);
		
		do {
			System.out.print("Introduzca grados a cambiar: ");
			x = aux.nextLine();
			try {
				n = Integer.parseInt(x);
				error = false;
			} catch (Exception e) {
				System.out.println("no has introducido un numero");
				error = true;
			}

		} while (error);

		return n;

	}

}
