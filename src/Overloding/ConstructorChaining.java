package Overloding;

class Car{
	Car(){
		System.out.println("No-arg constructor");
	}	
	Car(int a){
		this();
		System.out.println("Parameterized constructor");
		
	}
	
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Car car = new Car(10);
	}

}