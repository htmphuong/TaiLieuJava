package basic;

import java.util.Scanner;

public class Students implements Comparable<Students> {
	 private String name;
	 private double average;
	 //get, set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	//default constructor
	public Students() {
		this.name="";
		this.average=0.0;
	}
	//parameterized constructor
	public Students(String name, double average) {
		this.name=name;
		this.average=average;
	}
	public Students(Students s) {
		this.name = s.name;
		this.average=s.average;
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		this.name = sc.nextLine();
		System.out.println("Enter average");
		this.average=Double.parseDouble(sc.nextLine());
	}
	public void output() {
		System.out.println("Student has"+this.getName()+" and average ="+this.getAverage());
	}
	public int compareTo(Students A,Students B) {
		return (int)(A.average - B.average); 
	}
	@Override
	public int compareTo(Students other) {
		// TODO Auto-generated method stub
		Students student = other;
		return (int)(this.average-other.average);
	}
	
	
	
}
