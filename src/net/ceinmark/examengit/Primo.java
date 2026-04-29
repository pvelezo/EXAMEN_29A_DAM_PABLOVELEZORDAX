package net.ceinmark.examengit;

import java.util.Scanner;

public class Primo {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Primo app = new Primo();
		app.saludar();
		app.esPrimo();
		
	}

	public void saludar() {
		System.out.println("Buenos días Ceinmark, soy Pablo Vélez.");
	}
	
	public boolean esPrimo() {
		
		System.out.print("Introduce un número para averiguar si es primo o no: ");
		int primo = Integer.parseInt(sc.nextLine());
		
		
		
		return false;
	}
	
}
