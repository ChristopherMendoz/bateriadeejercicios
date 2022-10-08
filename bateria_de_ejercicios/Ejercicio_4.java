package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 , n2 ,n3 , resultado = 0;
		
		System.out.println("----------Bienvenidos----------");
		System.out.println("Programa que pida tres numeros; si el primero es negativo, debe imprimir el producto de los tres y si no lo es, imprimirá la suma." );
		System.out.println("Digite el primer numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite el segundo numero: ");
		n2 = sc.nextInt();
		System.out.println("Digite el tercer numero: ");
		n3 = sc.nextInt();
		
		if(n1 < 0 ) {
			resultado= n1*n2*n3;
		} else {
			resultado = n1+n2+n3;
		}
		System.out.println("El resultado es: " + resultado);

	}

}
