package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador , maximo, media,minimo,num,suma;

		System.out.println("-----Bienvenidos-----");
		System.out.println("Ingrese los numeros: ");
		num=sc.nextInt();
		minimo=num;
		maximo=num;
		suma=0;
		contador=0;
		while ((num!=0)) {
		    if ((num>maximo)) {  
		         maximo=num;
		}
		    if ((num<minimo)) {
	         	minimo=num;
		}

		suma=suma+num;
		contador=contador+1;
		num=sc.nextInt();

		}
		media=suma/(contador);
		System.out.println("El maximo es "+maximo);
		System.out.println("El minimo es "+minimo);
		System.out.println("La media es "+media);
	}


	}


