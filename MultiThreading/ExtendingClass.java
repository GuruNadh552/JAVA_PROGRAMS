import java.lang.*;
class cname extends Thread
{
	boolean exit = false,sus=false;
	@Override
	public void run()
	{
		try{
			for (int i=0;i<10;i++)
				System.out.println(i);
			if (exit)
				System.out.println("Thread Stopped");
			synchronized (this)
			{
				while (sus)
				{
					System.out.println("Thread suspend");
					wait();
				}
			}
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	public void stopR()
	{
		exit = true;
	}
	public void susp()
	{
		sus = true;
	}
	synchronized void res() {
      sus = false;
      notify();
   }
}
class Main
{
	public static void main(String[] args) {
		cname ob = new cname();
		cname ob1 = new cname();
		cname ob2 = new cname();
		System.out.println(" Thread Id : " + ob.getId());
		System.out.println(" Thread Name  : " + ob.getName());
		System.out.println(" Thread Priority : " + ob.getPriority());
		System.out.println(" Thread Status : " + ob.isAlive());
		ob.setName("Guru");
		ob.setPriority(1);
		ob.start();
		ob.stopR();
		System.out.println(" After Setting Custom Name and Priority :");
		System.out.println(" Thread Name  : " + ob.getName());
		System.out.println(" Thread Priority : " + ob.getPriority());
		ob1.start();
		ob1.susp();
		ob2.start();
		ob1.res();
	}
}