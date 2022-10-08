package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cant_jamon,cant_cerve,cant_refre;
		double Jamon ,Refresco,Cerveza,total;
		Jamon = 1.5;
		Refresco = 1.05;
		Cerveza = 0.75;
		total = 0;
		
		System.out.println("-------Bienvenidos------");
		System.out.println("Introduce la cantidad de bocadillos de Jamon: ");
		cant_jamon = sc.nextInt();
		System.out.println("Introduce la cantidad de Refrescos: ");
		cant_refre = sc.nextInt();
		System.out.println("Introduce la cantidad de Cerveza: ");
		cant_cerve = sc.nextInt();
		
		total = ((cant_jamon * Jamon )+ (cant_refre * Refresco)+ (cant_cerve * Cerveza));
		System.out.println("La cuenta es: C$"  + total);
		
		

	}

}
