import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pc1Num, pc2Num, pc1Qtd, pc2Qtd;
		double pc1Vl, pc2Vl, tot;
		
		pc1Num = sc.nextInt();
		pc1Qtd = sc.nextInt();
		pc1Vl = sc.nextDouble();
		
		pc2Num = sc.nextInt();
		pc2Qtd = sc.nextInt();
		pc2Vl = sc.nextDouble();
		
		tot = (double) (pc1Qtd * pc1Vl) + (pc2Qtd * pc2Vl);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", tot);
		
		sc.close();
	} 
}
