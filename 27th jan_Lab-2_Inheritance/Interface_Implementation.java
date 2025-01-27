interface Transport
{   
	
	void start();
	void stop();
}

class Bus implements Transport
{
	public void start()
	{
		System.out.println("Starting bus");
	}
	public void stop()
	{
		System.out.println("Stopping bus");
	}
}

class Train implements Transport
{
	public void start()
	{
		System.out.println("Starting train");
	}
	public void stop()
	{
		System.out.println("Stopping train");
	}
}

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus();
		b.start();
		b.stop();
		Train t = new Train();
		t.start();
		t.stop();
	}

}
