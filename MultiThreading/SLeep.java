class th extends Thread
{
	public  void run()
	{
		for (int i=0;i<10 ;i++ ) {
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Thread  : " + i);			
		}
	}
}
class SLeep
{
	public static void main(String[] args) {
		th ob = new th();
		th ob1 = new th();
		th ob2 = new th();
		System.out.println(ob.getId());
		ob.start();
		try
		{
			ob.join();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		ob1.start();
		try
		{
			ob1.join();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		ob2.start();
	}
}