package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int anio ;
		
		System.out.println("------Bienvenido------");
		System.out.println("Introduzca el año: ");
		anio = sc.nextInt();
		if (anio % 400 == 0){
	        System.out.println("Es un año bisiesto.");
	    }else if (anio % 100 == 0){
	        System.out.println("No es un año bisiesto");
	    }else if (anio % 4 == 0){
	        System.out.println("Es un año bisiesto");
	    }else{
	        System.out.println("No es un año bisiesto");
	    }
	    }
		
		

	}


