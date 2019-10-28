import java.lang.*;
class th implements Runnable
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Thread1 : " + i);
		}
	}
}
class th1 implements Runnable
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Thread2 : " + i);
		}
	}
}
class MultiTRun
{
	public static void main(String[] args) {
		th ob = new th();
		th1 ob1 = new th1();
		Thread t = new Thread(ob);
		Thread t1 = new Thread(ob1);
		t.start();
		t1.start();
	}
}