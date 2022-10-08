package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ninos , ninas , totalalumnos;
		
		System.out.println("----------Bienvenidos----------");
		System.out.println("Digite la cantidad de Ninos del aula: ");
		ninos = sc.nextInt();
		System.out.println("Digite la cantidad de Ninas del aula: ");
		ninas = sc.nextInt();
		
		
		totalalumnos = ninos + ninas;
	
		System.out.println("La suma total de Ninos y Ninas es : " + totalalumnos + "\n");
		 double p1 = ninos * 100 / totalalumnos;
		 System.out.println("El porcentaje de Ninos en el aula es : " + String.format("%.2f", p1) + " % ");
		 double p2 = ninas * 100 / totalalumnos;
		 System.out.println("El porcentaje de Ninas en el aula es : " + String.format("%.2f", p2) + " % ");

	}

}
