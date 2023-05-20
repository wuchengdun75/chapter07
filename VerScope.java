package chapter07.method;

public class VerScope {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		T t1 = new T();
		t1.test();
		
	}
}

class T {
	public void test() {
		Person1 p1 = new Person1();
		System.out.println(p1.name);
	}
	//public void test2() {
	//	System.out.println(p.name);
	}
}

class Person1 {
	public int age = 20;
	String name "jack";
	public void say() {
		String name = "king";
		System.out.println("say() name =  " + name);
	}
	public void hi() {
		String address = "北京";
		String name = "hsp";
	}
}