package Oop;

class VechileInfo{
	public void m1(){
		System.out.println("VechileInfo called");
	}
}

class TwoWheeler extends VechileInfo{
	int numberOfWheels = 2;
	public void m2(){
		System.out.println("TwoWheeler called");
	}
}

class MotorBike extends TwoWheeler{
	public void m3(){
		System.out.println("MotorBike called");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		MotorBike mb = new MotorBike();
		mb.m1();
		mb.m2();
		mb.m3();

	}

}