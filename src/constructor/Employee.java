package constructor;

import java.util.Scanner;

//default package : java.lang
//User-input:Scanner : java.util

//date -23/03/2023
/*
* In this code we 
* worked on user-input
*/

/**
* @author Atul
*
*/

public class Employee {
  int empId;
  String empName;
  
  Employee(int id,String name){
  	empId = id;
  	empName = name;
  }
  
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the employee id:");
	 int id = sc.nextInt();
	 System.out.println("Enter the employee name:");
	 String name = sc.next();
	 Employee emp = new Employee(id,name);
	 System.out.println(emp.empId);
	 System.out.println(emp.empName);
	  
	}

}