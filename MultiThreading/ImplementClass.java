import java.lang.*;
class th implements Runnable
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}
class ImplementClass
{
	public static void main(String[] args) {
		th ob = new th();
		Thread t = new Thread(ob);
		t.start();
	}
}