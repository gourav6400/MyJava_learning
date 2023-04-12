package STRING;

public class StringBuffer2 {

	private static String str;

	public static void main(String[] args) {
		//stringBuffer are mutable
	StringBuffer sb = new StringBuffer();
	System.out.println(sb);
	sb.append("J2EE");
	System.out.println(sb);
	
	//insert()
	sb.insert(4, "EJB");
	System.out.println(sb);
	
	//reverse ()
	sb.reverse();
	System.out.println(sb);
	
	String str = "we are learning StringBuiffer";
	StringBuffer sb4 = new StringBuffer(str);
	sb4.reverse();
	System.out.println(sb4);
	

	}

}
