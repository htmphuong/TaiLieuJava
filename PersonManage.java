package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PersonManage {
	//tao list cua Employee
	List<Employee> lstEmp = new ArrayList<Employee>();
	public PersonManage() throws ParseException {
		AddEmployee();
		ViewEmployee();
	}
	// add cac doi tuong employee vao lstEmp
	public void AddEmployee() throws ParseException {
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of emlpoyee ");
		n = Integer.parseInt(sc.nextLine());
		for (int i=0; i<n;i++) {
			//Employee emp = new Employee();
			//emp.Input();			
			System.out.println("Input name: ");
			String name = sc.nextLine();
			System.out.println("Input age:");			
			SimpleDateFormat df =new SimpleDateFormat("dd/mm/yyyy");		
			Date age = df.parse(sc.nextLine());	
			System.out.println("Input birthday:");
			String birthday = sc.nextLine();			
			System.out.println("Input salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			System.out.println("Input rate: ");
			double rate = Double.parseDouble(sc.nextLine());
			Employee emp = new Employee(name, age, birthday, salary, rate);
			lstEmp.add(emp); 
		}
	}
	public void ViewEmployee() {
		for(Employee emp:lstEmp) {
			System.out.println(emp.getName()+" has salary " + emp.calSalary());
		}
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		PersonManage p = new PersonManage();
		
	}

}
