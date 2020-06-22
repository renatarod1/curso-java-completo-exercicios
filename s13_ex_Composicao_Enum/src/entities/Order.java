package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> listOrders = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getListOrders() {
		return listOrders;
	}
	
	public void addItem(OrderItem item) {
		listOrders.add(item);
	}

	public void removeItem(OrderItem item) {
		listOrders.remove(item);
	}
	
	public Double total() {
		Double valorTotal = 0.0;
		for (OrderItem orderItem : listOrders) {
			valorTotal += orderItem.subTotal();			
		}
		return valorTotal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+ sdf2.format(moment) + "\n");
		sb.append("Order status: "+ getStatus() + "\n");
		sb.append("Client: "
				+ client.getName() 
				+ " (" + sdf1.format(client.getBirthDate()) 
				+ ") - " + client.getEmail() 
				+ "\n");
		sb.append("Order items: \n");
		
		for (OrderItem orderItem : listOrders) {
			sb.append(orderItem.getProduct().getName() 
					+ ", "
					+ orderItem.getQuantity()
					+ ", Subtotal: $" 
					+ String.format("%.2f", orderItem.subTotal()) 
					+ "\n");
		}
		sb.append("Total price: $" + String.format("%.2f",total()) + "\n");
		return sb.toString();	
		
	}
}
