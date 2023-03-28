package STRING;

public class Strings {

	public static void main(String[] args) {
		
		String txt = "hello";
		
		System.out.println(txt.toUpperCase());
		
		
		
		// split
				String data8 = "We are learninig java";
				String[] arr2 = data8.split(" ");
				for(int i=0;i<arr2.length;i++) {
					System.out.println(arr2[i]);
				}
				
				//reverse string
				String str8 = "My name is Teju";
				String[] arr3 = str8.split(" ");
				for(int i=0;i<arr3.length;i++) {
					System.out.println(arr3[i]);
				}
		
	}
	
}
