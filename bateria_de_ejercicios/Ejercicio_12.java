package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
		

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int i =1;
		int num =0;
		String N;
		
		System.out.println("Digite un N  :");
		N=s.nextLine();
		
		do {
			System.out.println(" + " +i);
			num = num + i;
			i++;
		}while(i<=100);
			System.out.println(" = " + num);

	}


}
