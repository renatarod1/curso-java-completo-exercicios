import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
		
		
		
		/*Resolução feinha porem funcionando rs
		double x, dif, imposto;
		
		x = sc.nextDouble();
		imposto = 0.0;
				
		if (x > 4500.0) {
			dif = x - 4500.00;
			imposto = (dif * 28.0) / 100;
			x = x - dif;			
			dif = x - 3000.00;
			imposto += (dif * 18.0) / 100;
			x = x - dif;			
			dif = x - 2000.00;
			imposto += (dif * 8.0) / 100;			
			System.out.printf("R$ %.2f%n", imposto);			
		} else if (x > 3000.01) {
			dif = x - 3000.00;
			imposto = (dif * 18.0) / 100;
			x = x - dif;	
			dif = x - 2000.00;
			imposto += (dif * 8.0) / 100;	
			System.out.printf("R$ %.2f%n", imposto);			
		} else if (x > 2000.01) {
			dif = x - 2000.00;
			imposto = (dif * 8.0) / 100;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			System.out.println("Isento");
		}		
		sc.close();*/
	}
}
