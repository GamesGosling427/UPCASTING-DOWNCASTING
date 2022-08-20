package upcasting_downcasting;

public class CarDriver {

	public static void main(String[] args) {
		System.out.println("===================");
		Vehicle v1= new ElectricCar();
		System.out.println("v1.a");
		v1.test();
		System.out.println("=====================");
		
		Car c1=new ElectricCar();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.demo();
		c1.test();
		System.out.println("===================");
		Vehicle v2=new ElectricCar();
		ElectricCar e1=(ElectricCar)v2;
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(e1.c);
		e1.test();
		e1.demo();
		e1.run();
	}

}
