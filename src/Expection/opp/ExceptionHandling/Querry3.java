package Expection.opp.ExceptionHandling;

public class Querry3 {
   
	public static void m2() {
		String str = null;
		int data = str.length();
		try {
			int result = 12/0;
		}catch(ArithmeticException ae) {
			System.out.println("Inside AE");
		}catch(Exception e) {
			System.out.println("Inside E");
		}
	}
	public static void main (String[]args) {
		m2();
	}
}
//java is programming language 
//Java is Programming Langwage
