package chapter07.method;

public class MethodDetail02 {
	public static void main(String[] args) {
		A a = new A();
		a.print(10);
		a.sayok();
		a.m1();
		
		
	}

}
class A {
	public void print(int n) {
		System.out.println("print()方法被调用 " + n);
	}
	
	public void sayok() {
		print(6666666);
		//同类方法间，直接调用。
		System.out.println("同类方法间 直接调用方法");
	}
	
	public void m1() {
		System.out.println("m1方法被调用");
		//创建对象调用 跨类方法
		B b = new B();
		b.hi();
		
		
	}
	
class B {
	public void hi() {
		System.out.println("hi()方法被调用");
	}
}
	
	
	
	
	
	
	
	
	
	
	
}
