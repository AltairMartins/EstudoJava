import java.util.Locale;
import java.util.Scanner;

public class ExeFic {

	public static void main(String[] args) {
	
	double pi = 3.14159, valor, resultado;
	
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	valor = sc.nextDouble();
	
	resultado = pi * valor * valor;

	
	System.out.println("A Area do Circulo é " + resultado);
	
	}

}
