package Inheritance;

class Base{
	Base(){
		this(20);
		System.out.println("Base class is called");
	}
	Base(int a){
		System.out.println("Base class with one arg");
	}
}

class Derived extends Base{
	Derived(){
		this(10);
		System.out.println("Derived class is called");
	}
	Derived(int a){
		super();
		System.out.println("Derived class with one arg");
	}
}

public class SingleInheritance2 {

	public static void main(String[] args) {
		Derived d = new Derived();

	}

}