package chapter07.method;

public class ConstructorDetail {
	
	public static void main(String[] args) {
		
		Person2319 p1 = new Person2319("king" , 40);
		Person2319 p2 = new Person2319("tom" , );
		Dog dog = new Dog();
	}

}

class Dog {
	public Dog(String dName) {
		
	}
}

class Person2319 {
	String name;
	int age;
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}
	public Person2319(String pname) {
		name = pname;
	}
	
	
	
	
}





