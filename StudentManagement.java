package basic;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {
	public StudentManagement() {
		addStudent();
		sortbyAverage();
	}
	Vector<Students> vStudents = new Vector<Students>();
	Enumeration<Students> eStudent;
	
	//add student
	public void addStudent() {
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		n = Integer.parseInt(sc.nextLine());				
		for (int i=0; i<n;i++) {
			Students st = new Students();
			st.input();
			vStudents.add(st);
		}		
	}
	//dua cac phan tu trong vector ve mang student vector->enumeration->mang students
	public void sortbyAverage() {
		Students [] arrStudent = new Students[vStudents.size()];
		eStudent = vStudents.elements();
		int index =0;
		while(eStudent.hasMoreElements()) {
			arrStudent[index] = (Students)eStudent.nextElement();
			index++;
		}
		Arrays.sort(arrStudent);
		for(int i=0;i<arrStudent.length;i++) {
			System.out.println("mang sau khi sap xep");
			System.out.println(arrStudent[i].getName()+" co diem trung binh "+arrStudent[i].getAverage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tao 1 vector kieu students, dung enumeration de chua cac elements cua vector
		new StudentManagement();
		
		
	}

}
