package Operator;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //arithmatic Operastor
	   //Relational Operators
	  //Logical operators 
      //Bitwise operator
	  //shift operator
	 //Unary operator
	//Assignment Operator
	//Ternary operator
		
		//Arithmatic operator
		int a = 20;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//quotient
		System.out.println(a%b);//remainder
		
		//Unary:increment / decrement
		//++ =+1 a++ = a = a+1
		
		int c = 10;
		int d = c++;
	//	d = c;
	//	c = c+1;
		System.out.println(c+" "+d);
		
		int e = 10;
		int f = ++e;
		System.out.println(e+" "+f);
		
		// Relational operator:boolean
		int x = 20;
		int y = 30;
		
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		
		//Logical Operators:&& ||
		//Combine the condition
		//Truth table 
		 
		int m=10;
		int n=40;
		
		System.out.println((m>n)&&(m==n));
		System.out.println((m<n)||(m==n));
		System.out.println(!(m<n));
		
		System.out.println(!(!(m<n)&&(m>n)));
		
		//Bitwise operator  
		int s = 10;//1010
		int t = 20;//10100
		
		System.out.println(s & t);
		System.out.println(s | t);
		System.out.println(s ^ t);
		
		//Shift Operator 
		//left shift: number *2^bit = 30 * 2^1
		int q = 30;
	int r = 20;
    System.out.println(q*2);
	System.out.println(q^2);
	System.out.println(q>>1);
    System.out.println(q<<1);
    
    // Assigment Operator:
    int j1=10;
    int sum=10;
    sum= sum +10;
    sum +=10;//COMPOUND STATEMENT
	  
      //   -= *= /= %=
    
		// Ternary
		int num1 = 10;
		int num2 = 20;
		if(num1>num2) {
			System.out.println(num1+" is greater ");
		}else {
			System.out.println(num2+ " is greater");
		}

	}

}
