package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw (Double amount) throws DomainExceptions {
		if (amount > this.getBalance()) {
			throw new DomainExceptions("Not enough balance");
		} 
				
		if (amount > this.getWithdrawLimit()) {
			throw new DomainExceptions("The amount exceeds withdraw limit");
		}
		
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f%n", balance);
	}
}
