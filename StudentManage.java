package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class StudentManage {
	Vector<Student> vStudent = new Vector<Student>();
	public StudentManage() throws ParseException {
		InputStudent();
		DisplayStudent();
	}
	//input list of students
	public void InputStudent() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("num of student=");
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {			
			System.out.println("Input name =");
			String name = sc.nextLine();
			System.out.println("Input birthday=");
			SimpleDateFormat df =new SimpleDateFormat("dd/mm/yyyy");		
			Date age = df.parse(sc.nextLine());
			System.out.println("Input avarge=");
			double average = Double.parseDouble(sc.nextLine());
			Student s = new Student(name, age, average);
			vStudent.add(s);
		}		
	}
	//display list of student
	public void DisplayStudent() {
		for(int i=0;i<vStudent.size();i++) {
			System.out.println(vStudent.get(i).getName()+" "+ vStudent.get(i).getBirthday());
		}
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		new StudentManage();
	}

}
