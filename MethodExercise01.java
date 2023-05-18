package chapter07.method;

public class MethodExercise01 {
	public static void main(String[] args) {
	Person p = new Person();
	p.name = "milan";
	p.age = 100;
	
	HH hh = new HH();
	Person p2 = hh.copyPerson(p);
	System.out.println("p2.name=" + p2.name + "\n" + "p2.age=" + p2.age);
	}
}

class Person {
	String name;
	int age;
}

class HH {
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
	
}






