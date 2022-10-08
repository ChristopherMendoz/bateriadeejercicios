package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Ingrese el numero :");
		   num=s.nextInt();
		}
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}

	}

}
