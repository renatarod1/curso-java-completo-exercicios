package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.next());
		sc.nextLine();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), new Client(nameClient, email, birthDate));
		
		System.out.print("How many items to this order? ");
		int qtdOrderItems = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= qtdOrderItems; i++) {			
			System.out.println("Enter # " + i + " item data: ");
			System.out.print("Product name: ");
			String name = sc.nextLine();	
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(name, price);
			OrderItem item = new OrderItem(quantity, price, product);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");			
		System.out.println(order);
		sc.close();
	}

}
