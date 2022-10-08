package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,contador,suma=0;
		
		System.out.println("-------Bienvenidos------");
		System.out.println("Ingrese N: ");
		N = sc.nextInt();
		contador = 0;
		int limite = N;
		while(contador < limite){
			if(N % 2==0) {
				suma = N + suma;
				contador= contador + 1;
				
			}
			N= N+1;
		}
		System.out.println("La suma es " + suma);

	}


}
