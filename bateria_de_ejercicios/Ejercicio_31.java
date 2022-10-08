package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_31 {
	public static void main(String[] args) {
		int dv;
		dv=0;
		Scanner lector= new Scanner(System.in);
		do {
			System.out.println("");
			System.out.println("Digite el numero a conocer(Para salir ingrese 0)");
			dv=lector.nextInt();
			for (int i = 1; i <dv; i++) {
			    if(dv%i==0) {
				    System.out.print(i + " ");
			    }
			}
		}while(dv>1);
	}
}

