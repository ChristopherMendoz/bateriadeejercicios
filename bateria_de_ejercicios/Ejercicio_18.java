package bateria_de_ejercicios;

import java.util.*;

public class Ejercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int dia,mes , anio;
		
		System.out.println("------Bienvenidos------");
		System.out.println("Escribe el Dia: ");
		dia = sc.nextInt();
		System.out.println("Escribe el Mes: ");
		mes = sc.nextInt();
		System.out.println("Escribe el Año: ");
		anio = sc.nextInt();
		
		if((dia <= 31 && dia >=0) && (mes <= 12 && mes >= 0) && anio >0) {
			System.out.print(dia);
			
			switch(mes){
			case 1: 
				System.out.print(" de enero ");
				break;
			case 22: 
				System.out.print(" de febrero  ");
				break;
			case 3: 
				System.out.print(" de marzo  ");
				break;
			case 4: 
				System.out.print(" de abril  ");
				break;
			case 5: 
				System.out.print(" de mayo  ");
				break;
			case 6: 
				System.out.print(" de junio  ");
				break;
			case 7: 
				System.out.print(" de julio  ");
				break;
			case 8: 
				System.out.print(" de agosto  ");
				break;
			case 9: 
				System.out.print(" de septiembre  ");
				break;
			case 10: 
				System.out.print(" de octubre  ");
				break;
			case 11: 
				System.out.print(" de noviembre  ");
				break;
			case 12: 
				System.out.print(" de diciembre  ");
				break;
			}
			System.out.println(anio);
			
		}else {
			System.out.println("ERROOORRRR");
		}
         System.out.println("------FIN DEL PROGRAMA------");
	}

}
