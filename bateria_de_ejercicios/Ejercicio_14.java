package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num,suma,elementos;
		float media;
		
		System.out.println("Introduzca un numero :");
		num=entrada.nextInt();
		suma=0;
		elementos=0;
		
		while(num>=0) {
			suma+=num;
			elementos++;
			System.out.println("Introduzca otro numero:");
			num=entrada.nextInt();
			
		   }
		     if(elementos==0) {
			    System.out.println("Imposible realizar la media");
			
		    } else {
			media=(float)suma/elementos;
			System.out.println("La media es :" + media);
		}
		
	}


}
