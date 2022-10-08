package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String alumno;
		int nota_practica, nota_final, nota_teorica, nota_problemas;

		System.out.println("------Bienvenidos------");
		System.out.println("Introduce el nombre del alumno: ");
		alumno = sc.next();
		
		while(alumno != "") {
			System.out.println("Introduce la nota practica: ");
			nota_practica = sc.nextInt();
			System.out.println("Introduce la nota de problema: ");
			nota_problemas = sc.nextInt();
			System.out.println("Introduce la nota de teoria: ");
			nota_teorica = sc.nextInt();
			
			if((nota_practica <= 10  && nota_practica >=0) && (nota_problemas <= 10 && nota_problemas >= 0) &&( nota_teorica  <=10  && nota_teorica >=0)) {
				System.out.println("El alumno " + alumno);
				System.out.println("La nota practica es " + nota_practica);
				System.out.println("La nota de problemas es " + nota_problemas);
				System.out.println("La nota teorica es " + nota_teorica);
				
				nota_practica = (int) (nota_practica *0.1);
				nota_problemas = (int) (nota_problemas * 0.5);
				nota_teorica = (int) (nota_teorica*0.4);
				nota_final = nota_practica + nota_problemas + nota_teorica;
				
				System.out.println("La nota final es " + nota_final);
				
			}else {
				System.out.println("Has escrito una nota incorrecta, vuelve a intentarlo!");
		}
			System.out.println("Introduce el nombre de otro alumno ");
			alumno = sc.next();
		}	
	}
	
}   

