package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
	
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int vA , vB , vC;

    System.out.println("--------------Bienvenidos-------------");
    System.out.println("En este programa pedimos dos variables e intercabiamos el valor entre ambas.");
    System.out.print("Digite el valor A: ");
    vA = sc.nextInt();

    System.out.println("Digite el valor B: ");
    vB = sc.nextInt();
    vC = vA;
    vA = vB;
    vB = vC;
    
    System.out.println("Tras el cambio, valor A= " + vA + " y valor B = " + vB);
    
  }


}
