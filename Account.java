package basic;

import java.util.Scanner;

public class Account {
	private int id;
	private double balance;
	// default constructor
	public Account() {
		//this.id=5;
	}
	//parameterized constructor
	public Account(int id, double balance) {
		this.id=id; //10
		this.balance=balance; //5000
	}
	public Account(Account acc) {
		this.id= acc.id;
		this.balance=acc.balance;
	}
	
	
	//get,set
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
		
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//input id
	public void InputAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Id=");
		this.id=sc.nextInt();
		System.out.println("Input Balance=");
		this.balance = sc.nextDouble();
	}
	// deposit money
	public double Deposit(double deposit) {		
		this.balance = this.getBalance() + deposit;
		return this.balance;
	}
	//withdraw money
	public double Withdraw(double withdraw) {
		this.balance = this.getBalance() - withdraw;
		return this.balance;
	}
	
	
	
	public void OutputAccount() {
		System.out.println("Id="+this.getId()+" has balance ="+ this.getBalance());
	}

}
