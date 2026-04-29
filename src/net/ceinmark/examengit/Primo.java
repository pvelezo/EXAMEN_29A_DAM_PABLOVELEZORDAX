package net.ceinmark.examengit;

import java.util.Scanner;

public class Primo {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Primo app = new Primo();
		app.saludar();
		if (app.esPrimo()) {
			System.out.println("El número es primo.");
		} else {
			System.out.println("El número no es primo.");
		}
		
	}

	public void saludar() {
		System.out.println("Buenos días Ceinmark, soy Pablo Vélez.");
	}
	
	public boolean esPrimo() {
		
		System.out.print("Introduce un número para averiguar si es primo o no: ");
		int primo = Integer.parseInt(sc.nextLine());
		// Aquí se realiza la formula para saber si el número es primo o no.
		return false;
	}
	
}
