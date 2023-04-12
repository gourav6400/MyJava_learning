package Oop;

interface A{
	public void m1();
}
interface B{
	public void m1();
}

class C implements A,B{
	public void m1(){
		System.out.println("M1 implemented here");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		C c  = new C();
		c.m1();

	}

}