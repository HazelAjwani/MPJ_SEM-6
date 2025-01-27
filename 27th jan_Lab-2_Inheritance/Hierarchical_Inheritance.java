import java.util.Scanner;

class Vehicle
{
	String brand;
	int speed;
	public Vehicle(String brand, int speed)
	{
		this.brand=brand;
		this.speed=speed;
	}
	public void display()
	{
		System.out.println("Vehicle details:");
		System.out.println("brand:" + brand);
		System.out.println("speed:" + speed);
	}
}

class Car extends Vehicle
{
	String fuelType;
	public Car(String brand, int speed,String fuelType)
	{
		super(brand,speed);
		this.fuelType=fuelType;
	}
	public void display()
	{
		super.display();
		System.out.println("fuel type:" + fuelType);
	}
}

class Bike extends Vehicle
{
	String engineCapacity;
	public Bike(String brand, int speed,String engineCapacity)
	{
		super(brand,speed);
		this.engineCapacity=engineCapacity;
	}
	public void display()
	{
		super.display();
		System.out.println("engine capacity:" + engineCapacity);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		String brand;
		int speed;
		
		System.out.println("enter c if car and b if bike:");
		ch=sc.next().charAt(0);
		
		System.out.println("enter the vehicle details:");
		System.out.println("enter brand:");
		brand=sc.next();
		System.out.println("enter speed:");
		speed=sc.nextInt();
		
		
		
		switch(ch)
		{
		case 'c': System.out.println("Vehicle type: Car");
			      String fuelType;
				  System.out.println("enter fuel type:");
				  fuelType=sc.next();
		         
			     Car c = new Car(brand,speed,fuelType);
			      c.display();
			      break;
		case 'b': System.out.println("Vehicle type: Bike");
			      String engineCapacity;
		          System.out.println("enter engine capacity:");
		          engineCapacity=sc.next();
		          
		          Bike b = new Bike(brand,speed,engineCapacity);
			      b.display();
	              break;
	    default: System.out.println("Invalid input");
		}
	}

}
