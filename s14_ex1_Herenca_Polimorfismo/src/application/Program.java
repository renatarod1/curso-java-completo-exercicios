package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Product product;
		List <Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #"+ i +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (productType == 'c') {
				product = new Product(name, price);
				products.add(product);
			} else if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				product = new UsedProduct(name, price, manufactureDate);
				products.add(product);
			} else {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				product = new ImportedProduct(name, price, customsFee);
				products.add(product);
			}
		}
			
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product prod : products) {
			System.out.print(prod.priceTag());
		}

		sc.close();
	}

}
