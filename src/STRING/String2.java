package STRING;

public class String2 {

	public static void main(String[] args) {
		//charAt():
		String str = "Java";
		char ch = str.charAt(0);
		//char ch2 = (char) ((char) ch+32);//A->65 a->97
		//System.out.println(ch);
		System.out.println(ch);
		
		String str2 = "java";
		char ch2 = 'J';//74-106=-106+74=-32
		int data = ch2;
		
		System.out.println(data);
		System.out.println(str.compareTo(str2));
		
		String str3 = "Java";
		String str4 = "Jbva";
	   System.out.println("Jbva");
	   
	   //concat()
	   String name1 = "Anuj";
	   String name2 = "Nair";
	   System.out.println(name1+name2);
	   System.out.println(name1.concat(name2));

	    //Contains();
	   String text = " We are learning Java";
	   System.out.println(text.contains("J"));
	   
	   //endsWith();
	   System.out.println(text.endsWith("Java"));
	   
	   //equals:check cintent of string
	   //== : checks memory location
	   
	   String data1 = "Hello";
	   String data2 = "Hello";
	   System.out.println(data1.equals(data2));	  
	   System.out.println(data1==(data2));
	   
	   
	   String data3 = new String("Hello");
	   String data4 = new String("Hello");
	   System.out.println(data3.equals(data4));	  
	   System.out.println(data3==(data4));
	   
	   System.out.println("Hello".equals("hello"));
	   System.out.println("Hello".equalsIgnoreCase("hello"));
	   
		
	}

}
