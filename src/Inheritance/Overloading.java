package Inheritance;

public class Overloading {
 
	public void m1() {
		System.out.println("m1 without args");
	}
	public void m1(int a ) {
		System.out.println("m1 with args");
	}
	public void m1(String b) {
		System.out.println("m1 with string args");
	}
	public static void main(String[] args) {
		Overloading overloading = new Overloading ();
		overloading.m1();
		overloading.m1("Aman");
		overloading.m1(12);
	}
}
