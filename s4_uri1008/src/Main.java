import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc, horasTrab;
		double vlTrab, salary;
		
		numFunc = sc.nextInt();
		horasTrab = sc.nextInt();
		vlTrab = sc.nextDouble();
		
		salary = (double)horasTrab * vlTrab;		
		System.out.println("NUMBER = "+ numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}
}
