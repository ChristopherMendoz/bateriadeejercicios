package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bachiller, prueba_acceso;
		
		System.out.println("-----Bienvenido----");
		System.out.println("Tienes el titulo de bachiller?");
		bachiller = sc.nextLine();
		
		if(bachiller == "si") {
			  System.out.println("Puedes acceder al grado superior");
			  
		}else {
			System.out.println("Tienes prueba de acceso superada?");
			prueba_acceso = sc.nextLine();
		
			if(prueba_acceso == "si") {
				System.out.println("Puedes acceder al grado superior");}
				
		
		
			else {
				System.out.println("No puedes acceder a un grado superior");
			}
		}
	}

}
