package constructor;

//use of this keyword:refers to object
//differentiate between local and instance variable
//Constructor chaining

public class Product {
	int productId;
	String productName;
	String productDesc;
	
	Product(int productId,String productName,String productDesc){
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		System.out.println("Inside constructor = "+this);
	}

	public static void main(String[] args) {
		Product p1 = new Product(1001,"headphone","Nice heqadphone");
		System.out.println(p1);
		Product p2 = new Product(1002,"mobiles","Nice mobiles");
		System.out.println(p2);
		
		
		
		System.out.println(p1.productId);
		System.out.println(p1.productName);
		System.out.println(p1.productDesc);

	}

}

