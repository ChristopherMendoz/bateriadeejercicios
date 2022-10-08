package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double compra , total;
		String mes;
		
	
		
		System.out.println("-------Bienvenidos------");
		System.out.println("Introduce el monto de compra: ");
		compra = sc.nextDouble();
		System.out.println("Introduce el mes");
		mes = sc.next();
		

		if(mes.equals("febrero")) {
			total = (compra * 0.85);
			System.out.println("El monto a pagar Despues del 15% de descuento es: " + total);
		}else {
			total = compra;
			System.out.println("El monto a pagar sin el descuento 15%  es: " + compra);
			
		}
		System.out.println("-----Muchas Gracias-----");
	}
}
