package Overloding;

public class Test2 {
    Test2(){
    	System.out.println("No-args constructor is called");
    }
    Test2(int id){
    	System.out.println("Parameterized constructor is called");
    }
	public static void main(String[] args) {
		Test2 t = new Test2(10);

	}

}