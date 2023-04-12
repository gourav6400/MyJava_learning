package Inheritance;

class Bike{
   public Bike()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class Maruti extends Car{
   public Maruti()
   {
	System.out.println("Class Maruti");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
public class Multilevel extends Maruti{

   public Multilevel()
   {
	System.out.println("Maruti Model: 800");
   }
   public void speed()
   {
	System.out.println("Max: 80Kmph");
   }
   public static void main(String args[])
   {
	 Multilevel obj=new Multilevel();
	obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
private void vehicleType() {
	// TODO Auto-generated method stub	
}

}