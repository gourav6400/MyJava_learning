package STRING;

public class StringNew {
  
	 public static void main(String[]args) {
		 
      //String are immutable 
		 String str = "Java";
		 System.out.println(str);
		str.concat("language");//Java language
		System.out.println(str);
		 
		 str = str.concat("language");
		System.out.println(str);
		 
		// String str = "Hello"; 
		// String str2 = str;	 
		// str = "world";
		// str2 = str;
		// System.out.println(str);
		// System.out.println(str2);
		 
         
		 //Literal =>value
		 //New  
		 // String str = "Hello"
		 
	 }
}
