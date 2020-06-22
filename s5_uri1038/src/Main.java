import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod, qtd;
		double tot;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
				
		if (cod == 1) {
			tot = (double) qtd * 4.0; 
		} else if (cod == 2) {
			tot = (double) qtd * 4.5;
		} else if (cod == 3) {
			tot = (double) qtd * 5.0;
		} else if (cod == 4) {
			tot = (double) qtd * 2.0;
		} else {
			tot = (double) qtd * 1.5;
		}
		System.out.printf("Total: R$ %.2f%n", tot);
		sc.close();
	}
}
