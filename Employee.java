package Inheritance;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
	private double salary;
	private double rate;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Employee() {
		
	}
	public Employee(String name, Date age, String birthday, double salary, double rate) {
		super(name, age, birthday);
		this.salary = salary;
		this.rate = rate;
	}
	public double calSalary() {
		return this.rate*this.salary;
	}
	public void Input() throws ParseException {
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input salary: ");
		this.salary = Double.parseDouble(sc.nextLine());
		System.out.println("Input rate: ");
		this.rate = Double.parseDouble(sc.nextLine());
	}
	public void ViewDetail() {
		super.ViewDetail();
		System.out.println(" has salary= "+this.calSalary());
	}
}
