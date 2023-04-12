package Function;

public class Method {

	//non - static - (function definition )
	public void m1() {
		System.out.println("m1() is executed");
	}
	//static function -(function definition)
	public static void m2() {
		System.out.println("m2() is executed");
	}
	public static void mai(String[] args) {
		Method obj = new Method();
		obj.m1();//invoking a fuction or calling a function 
		System.out.println("Value of obj :"+obj);
		Method obj2 = new Method();
		System.out.println("Value of obj "+obj2);
		
		//using classname
	}
	
}
