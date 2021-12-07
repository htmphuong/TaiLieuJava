package Inheritance;

import java.util.Date;

public class Student {
	private String name;
	private Date birthday;
	private double average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public Student() {
		
	}
	public Student(String name, Date birthday,double average) {
		this.name = name;
		this.birthday = birthday;
		this.average = average;
	}
	
}
