package entities;

public class Account {
	private int accountNumber;
	private String holder;
	private double initialDeposit;
	private double balance;
	
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.initialDeposit = initialDeposit;
		deposit(this.initialDeposit);
	}
	
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.initialDeposit = 0.0;
		deposit(this.initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}	
	
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}

	@Override
	public String toString() {
		return "Account " 
				+ this.getAccountNumber() 
				+ ", Holder: " 
				+ this.getHolder() 
				+ ", Balance: $ " 
				+ String.format("%.2f%n", balance);
	} 	
}
