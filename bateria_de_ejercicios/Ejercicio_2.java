package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 , n2;
		
		System.out.println("----------Bienvenidos----------");
		System.out.println("Programa que nos pide dos valores y nos dice si son iguales o bien cual es el mayor." );
		System.out.println("Digite el primer numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite el segundo numero: ");
		n2 = sc.nextInt();
		
		if(n1 == n2) {
		      System.out.print("Los dos numeros son iguales");
		}
		  if(n1 > n2) {
		      System.out.print("El numero mayor es : " + n1);
		  }
		  if(n2 > n1) {   
		      System.out.print("El numero mayor es : " + n2);
		  }

	}
}

