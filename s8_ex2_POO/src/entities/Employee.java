package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		percentage *= (double)0.01;
		this.grossSalary += this.grossSalary * percentage;
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
