package ejerciciosif;
import java.util.Scanner;
public class Ejercicio3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número decimal: ");
	        double numero = scanner.nextDouble();

	        // Comprobar si es un número casi-cero
	        if ((numero > -1 && numero < 0) || (numero > 0 && numero < 1)) {
	            System.out.println("El número es un número casi-cero.");
	        } else {
	            System.out.println("El número no es un número casi-cero.");
	        }

	        scanner.close();
	    }
	}
