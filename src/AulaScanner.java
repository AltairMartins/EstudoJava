import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		char L;
		int y;
		String x;
		double a;
		
		L= sc.next().charAt(0); //primeiro carcter
		x= sc.next();
		y= sc.nextInt();
		a= sc.nextDouble();
		
		System.out.println(L);
		System.out.println("Voce Digitou: " + y + " " + x);
		System.out.printf("Voce Digitou: %.2f%n", a);
		
		sc.close();

	}

}
