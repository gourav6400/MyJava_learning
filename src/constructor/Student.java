package constructor;

public class Student {
    int studentId;
    String studentName;
    
    //creating a constructor: className(){}
    Student(int id,String name){
    	studentId = id;
    	studentName = name;
    }
    
	public static void main(String[] args) {
		Student s1 = new Student(101,"Arun");
		Student s2 = new Student(102,"Amit");
		System.out.println(s1.studentId);
		System.out.println(s1.studentName);
		System.out.println("==========================");
		System.out.println(s2.studentId);
		System.out.println(s2.studentName);
	}

}
