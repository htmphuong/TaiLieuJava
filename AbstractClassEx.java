
abstract class Animal
{
	public abstract void makeSound();//can't define the sound of animal in general
	public void display()
	{
		System.out.println("Any animal should be able to make sound");
	}
}
class Cat extends Animal //means Cat is an animal | is-a relationship
{
	public void makeSound()
	{
		System.out.println("Meo Meo");
	}
	
}
class Dog extends Animal //means Dog is an animal | is-a relationship
{
	public void makeSound()
	{
		System.out.println("Gout Gout");
	}
}
public class AbstractClassEx {

	public static void main(String[] args) {

		Animal A, B;
		
		A= new Cat();
		B=new Dog();
		A.makeSound();
		B.makeSound();
		
	}

}
