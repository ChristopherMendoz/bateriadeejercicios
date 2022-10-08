package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		double a,b,c;
		double raiz1,raiz2;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingrese el valor de a ");
			a=sc.nextDouble();
			System.out.println("Ingrese el valor de  b");
			b=sc.nextDouble();
			System.out.println("Ingrese el valor de c");
			c=sc.nextDouble();
		}
		if((4*a*c) > (b*b)) {
			System.out.println("Las raices son imaginarias");
			
		}else if(a>0 || a<0) {
			double temporal =(b*b)-4*a*c;
			raiz1=-b+ Math.pow(temporal, 0.5);
			raiz1=raiz1/(2*a);
			raiz2 =((-b)-(Math.pow(temporal,0.5)))/(2*a);
			System.out.println("La primera raiz es :" +raiz1);
			System.out.println("La segunda raiz es :" +raiz2);
			
		}
		

	}

		

	}


