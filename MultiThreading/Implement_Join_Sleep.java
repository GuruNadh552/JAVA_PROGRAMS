class guru implements Runnable
{
	public  void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Thread Started :" + t.getName());
		for (int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(4500);
			}
			catch(InterruptedException a)
			{
				a.printStackTrace();
			}
		System.out.println(i);
		System.out.println("Thread Ended : "+t.getName());
		}
	}
}
public class Implement_Join_Sleep
{
	public static void main(String[] args) {
		Thread th1 = new Thread(new guru(),"th1");
		Thread th2 = new Thread(new guru(),"th2");
		Thread th3 = new Thread(new guru(),"th3");
		th1.start();
		System.out.println("Thread Status : "+th1.isAlive());
		try
		{
			th1.join();
			System.out.println("Thread Status : "+th1.isAlive());
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		th2.start();
		System.out.println("Thread Status : "+th2.isAlive());
		try
		{
			th2.join();
			System.out.println("Thread Status : "+th2.isAlive());
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		th3.start();
		System.out.println("Thread Status : "+th3.isAlive());
		try
		{
			th3.join();
			System.out.println("Thread Status : "+th3.isAlive());
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("All Threads Completed");
	}
}