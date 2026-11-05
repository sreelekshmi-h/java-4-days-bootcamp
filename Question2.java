package proj;

public class Question2 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.name="animal1";
		a.eat();
		a.sleep();
		
		Dog d=new Dog();
		d.name="dog1";
		d.eat();
		d.sleep();
		d.bark();
		

	}

}
class Animal{
	String name;
	int age;
	void eat() {
		System.out.printf("Animal %s eat",name);
		System.out.println();
	}
	void sleep() {
	   System.out.printf("Animal %s sleep",name);
	   System.out.println();
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog bark");
		System.out.println();
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("Cat meow");
		System.out.println();
	}
}
