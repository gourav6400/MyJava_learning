package Overloding;


//Passing object reference to Constructor


public class EmployeeInfo {
  int empId;
  String empName;
  
  EmployeeInfo(int empId,String empName){
  	this.empId = empId;
  	this.empName = empName;
  }
  EmployeeInfo(EmployeeInfo obj){
  	this.empId =obj.empId;
  	this.empName = obj.empName;
  }
	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo(1001,"Ajit");
		EmployeeInfo emp2 = new EmployeeInfo(emp);
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
	}

}