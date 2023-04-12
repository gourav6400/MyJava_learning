package Oop;

class Vechile{
	int numberOfwheels = 2;
//	Vechile(){
//		System.out.println("Vechile class is called");
//	}
	
	public void m1(){
		System.out.println("Called from Parent class");
	}
}

class FourWheeler extends Vechile{
	int numberOfwheels =4; 
//	FourWheeler(){
//		super();
//		System.out.println("FourWheeler class is called");
//	}
	
	public void m1(){
		System.out.println("Called from Child class");
	}
}
public class Singalinheritance {
	public static void main(String[] args) {
		FourWheeler fw = new FourWheeler();
        //System.out.println(fw.numberOfwheels);
        fw.m1();
        
        Vechile v = new FourWheeler();
       // System.out.println(v.numberOfwheels);
        v.m1();
	}

}
//variables: depends on type of reference
//methods :depends on type object
