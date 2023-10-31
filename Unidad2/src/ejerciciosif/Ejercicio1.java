package ejerciciosif;
import java.util.Scanner;
class Ejercicio1 {
		public static void main(String[] args) {

			        int num;
			        // Pedimos al usuario que introduzca un numero
			        System.out.println("Introduzca un numero: ");
			        
			        Scanner scanner = new Scanner(System.in);
			        
			        // Read the user's input and store it in the 'num' variable
			        num = scanner.nextInt();
			        
			        // Close the scanner to release resources
			        scanner.close();

			        if (num % 2 == 0) {
			            System.out.println("El numero es par");
			        } else {
			            System.out.println("El numero es impar");
			        }
			    }

	}