package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course A ? ");
		int n = sc.nextInt();
			
		for (int i = 1; i <= n; i++) {			
			set.add(sc.nextInt());			
		}
		
		System.out.print("How many students for course B ? ");
		int n1 = sc.nextInt();
			
		for (int i = 1; i <= n1; i++) {			
			set.add(sc.nextInt());			
		}
		
		System.out.print("How many students for course C ? ");
		int n2 = sc.nextInt();
			
		for (int i = 1; i <= n2; i++) {			
			set.add(sc.nextInt());			
		}
		
		System.out.println("Total students: "+ set.size());
		sc.close();
	}
}
