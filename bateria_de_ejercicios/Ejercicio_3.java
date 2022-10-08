package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner nume = new Scanner (System.in);
		int n1=0,n2=0,n3=0,mayor=0;
		
		System.out.println("----------Bienvenidos----------");
		System.out.println("Programa para saber cual es el mayor de tres numeros distintos." );
	    System.out.println("Digite el primer  numero: ");
	     n1 = nume.nextInt();
	    System.out.println("Digite el segundo numero: " );
	     n2 = nume.nextInt();
	    System.out.println("Digite el tercer numero: " );
	     n3 = nume.nextInt();   

        if (n1 > n2 && n1 > n3) {
	         System.out.println("El numero mayor es: " + n1);
           }
	       
	    if (n2 > n1 && n2 > n3) {
	         System.out.println("El numero mayor es: " + n2);
	       }

       	if (n3 > n1 && n3 > n2) {
	         System.out.println("El numero mayor es: " + n3);       
	    }
	}

}
