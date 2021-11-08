package basic;

import java.util.Scanner;

public class Person {
	protected String name; //field
	protected double rate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	//default contructor
	public Person() {
		
	}
	public Person(String name ,double rate) {
		this.name = name;
		this.rate = rate;
	}
	public Person(Person p) {
		this.rate = p.rate;
		this.name = p.name;
	}
	
	public void Input() { //method
		int a;
		Scanner  key = new Scanner(System.in);
		System.out.println("Name =");
		this.name= key.nextLine();
		System.out.println("Rate =");
		this.rate= Double.parseDouble(key.nextLine());
		
	}
	public void calSalary() { //method
		this.Input();
		this.name="abc";
	}
	public void Output() {
		System.out.println("Name ="+this.getName());
	}
}
