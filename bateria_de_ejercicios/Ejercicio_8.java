package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    	int numero; 
	    	
	    	System.out.println("------Bienvenidos------");
	    	System.out.println("Digite un numero: ");
	    	numero = sc.nextInt();
	    	
	    	if(numero == 0) {
	    		System.out.println("El " + numero + "no es par ni impar");
	    		
	    	}else {
	    		if(numero % 2==0 ) {
	    			System.out.println("El " + numero + " es par ");
	    		}else {
	    			System.out.println("El " + numero + " no es par");
	    		}
	    	}
	}

}
