package basic;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManage {
	public StudentManage() {
		this.addStudent();
		//this.viewStudent();
	//	this.viewStudentByName("abc");
		this.viewStudentStartName("Hello");
		this.viewStudentAverageBy(5.0);
	}
	
	Vector<Students> vStudent = new Vector<Students>();
	public void addStudent() {
		//nhap so luong sinh vien
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n;i++) {
			Students st = new  Students();
			st.input();
			vStudent.add(st);
		}		
	}
	//in students trong vector
	public void viewStudent() {
		//enumeration: lay danh sach sinh vien trong vector va luu tru
		Enumeration<Students> eStudent = vStudent.elements();
		while(eStudent.hasMoreElements()) {
			Students s =(Students)eStudent.nextElement();
			s.output();
		}
		
	}
	//tim kiem sinh vien co ten la abc
	public void viewStudentByName(String name) {
	//enumeration: lay danh sach sinh vien trong vector va luu tru
			Enumeration<Students> eStudent = vStudent.elements();
			while(eStudent.hasMoreElements()) {
				Students s =(Students)eStudent.nextElement();
				if(s.getName().contains(name))	s.output(); 
			}
	}
	// Tim cac sinh vien co ten bat day bang "Nguyen"
	public void viewStudentStartName(String name) {
		//enumeration: lay danh sach sinh vien trong vector va luu tru
				Enumeration<Students> eStudent = vStudent.elements();
				while(eStudent.hasMoreElements()) {
					Students s =(Students)eStudent.nextElement();
					if(s.getName().startsWith(name))	s.output(); 
				}
		}
	//tim cac sinh vien co diem trung binh duoi 5
	// Tim cac sinh vien co ten bat day bang "Nguyen"
		public void viewStudentAverageBy(double average) {
			//enumeration: lay danh sach sinh vien trong vector va luu tru
					Enumeration<Students> eStudent = vStudent.elements();
					while(eStudent.hasMoreElements()) {
						Students s =(Students)eStudent.nextElement();
						if(s.getAverage()<average)	s.output(); 
					}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManage sm = new StudentManage();
	}

}
