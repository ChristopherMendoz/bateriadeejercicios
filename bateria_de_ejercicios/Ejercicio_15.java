package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		int cont=0;
		String correctPass = "tuani";
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese su Contraseña");
		cont++;
		System.out.print("Intento No." + cont);
		String pass = in.nextLine();

		
		if(pass.equals(correctPass)) {
			System.out.println("-------------------------");
			System.out.println("Contrasena correcta");
			System.out.println("Fin");
			System.out.println("-------------------------");
		}else {
			//bilingue profe
			while(!pass.equals(correctPass) && cont <3) {
				cont++;
				System.out.println("Contrasena incorrecta");
				System.out.println("-------------------------");
				System.out.print("Intento No. " + cont + " ");
				pass = in.nextLine();

				if(pass.equals(correctPass)) {
					System.out.println("-------------------------");
					System.out.println("Contrasena correcta");
					System.out.println("Fin");
					System.out.println("-------------------------");
					break;
				}
			}
			System.out.println("-------------------------");
			System.out.println("Errorrr Cuenta Bloqueada");
			System.out.println("-------------------------");
		}
		in.close();
	}



	}


