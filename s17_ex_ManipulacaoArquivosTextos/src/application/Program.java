package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> listOfProducts = new ArrayList<>();

		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);

		boolean success = new File(path.getParent() + "\\out").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		String strNewPath = path.getParent() + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] prod = line.split(",");
				listOfProducts.add(new Product(prod[0], Double.parseDouble(prod[1]), Integer.parseInt(prod[2])));
				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strNewPath))) {
				for (Product product : listOfProducts) {
					bw.write(product.getName() + ", " + String.format("%.2f", product.totalPrice()));
					bw.newLine();
				}
				
				System.out.println(path.getParent() + "\\out\\summary.csv" + " CREATED!");
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
