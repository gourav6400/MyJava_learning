package Oop;

class ParentA{
	ParentA(){}
	ParentA(int a){
		System.out.println("Called from ParentA");
	}
}

class ChildB extends ParentA{
	int data=20;
	ChildB(){
		System.out.println("Called from ChildB");
	}
}
class ChildC extends ParentA{
	int data=30;
	ChildC(){
		System.out.println("Called from ChildC");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		ChildC c = new ChildC();
		System.out.println(c.data);

	}

}