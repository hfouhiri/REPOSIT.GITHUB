package ejerciciosif;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {		
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario que ingrese el primer número
	        System.out.print("Ingrese el primer número entero: ");
	        int numero1 = scanner.nextInt();

	        // Pedir al usuario que ingrese el segundo número
	        System.out.print("Ingrese el segundo número entero: ");
	        int numero2 = scanner.nextInt();

	        // Cerrar el objeto Scanner
	        scanner.close();

	        // Comprobar si los números son iguales
	        if (numero1 == numero2) {
	            System.out.println("Los números son iguales.");
	        } else {
	            System.out.println("Los números no son iguales.");
	        }
	 }

	}