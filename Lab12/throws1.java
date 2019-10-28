import java.util.*;
class guru
{
	void myOb(int n) throws IndexOutOfBoundsException , ArithmeticException
	{
		if (n==1)
			throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
		else
			throw new ArithmeticException("ArithmeticException");
	}
}
class throws1
{
	public static void main(String[] args) {
		guru x = new guru();
		try
		{
			x.myOb(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Completed");
		}
	}
}