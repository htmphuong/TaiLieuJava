package basic;

public class PersonManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person =new Person("Abc",5.5);
		
		Person p1 = new Person(person);
		p1.Output();
		
		Employee e = new Employee("DEF", 1.0, 2.0);
		e.Output();

	}

}
