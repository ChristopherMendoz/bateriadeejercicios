package bateria_de_ejercicios;

import java.util.Scanner;

public class Ejercicio_25 {

	public static void main(String[] args) {
		String sino;
		float celsius;
        try (Scanner sc = new Scanner(System.in)) {  
        	System.out.println("Â¿Desea convertir de c a f o viceversa?");
        	sino=sc.nextLine();
        	
			System.out.println("Ingresa los grados celsius: ");
			celsius = sc.nextFloat();
		}
        
        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.printf("%f grados celsius son %f grados fahrenheit", celsius, fahrenheit);
    }

    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32) / 1.8f;
    }
}


        
        




	


