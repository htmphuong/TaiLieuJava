package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Person {
	protected String name;
	protected Date age;
	protected String birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	//constructor
	public Person() {
		
	}
	
	public Person(String name, Date age,String birthday) {
		this.name = name;
		this.age=age;
		this.birthday = birthday;
	}
	public void Input() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		this.name = sc.nextLine();
		System.out.println("Input age:");
		/*String pattern = "dd-MM-yy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		this.age = simpleDateFormat.parse(sc.nextLine());*/
		SimpleDateFormat df =new SimpleDateFormat("dd/mm/yyyy");		
		Date age = df.parse(sc.nextLine());
		this.age  = age;
				
		//this.age = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(sc.nextLine());
		System.out.println("Input birthday:");
		this.birthday = sc.nextLine();
		// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		// String formattedDate = myDateObj.format(myFormatObj);  
		// this.birthday.format(myFormatObj);  
	}
	public void ViewDetail() {
		System.out.println("Name ="+this.getName()+ " and age ="+this.getAge());
	}
}
