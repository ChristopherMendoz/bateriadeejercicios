package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nume, poten;
		double raiz = 0;
		
		
		System.out.println("----------Bienvenidos----------");
		System.out.println("Programa que nos pide un numero si es mayor que 0 calcula raiz cuadrada y potencia al cuadrado si es menor sale y manda advertencia." );
		System.out.println("Digite un numero: ");
		nume = sc.nextInt();
		
		if(nume > 0) {
			poten = (int) Math.pow(nume, 2);
			raiz = (int) Math.sqrt(nume);
			System.out.println("Su potencia al cuadrado es: " + poten);
			System.out.println("Su raiz cuadrada es: " + raiz);
			
		}else {
			System.out.println("Error , introduce un numero mayor que 0!");
		}

	}

}
