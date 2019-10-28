import java.util.*;
class throw1
{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int a,b;
		a = n.nextInt();
		b = n.nextInt();
		try
		{
			if (b==0)
				throw new Exception ("Can't Divide");
			int result = a/b;
			System.out.println("Result = "+result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}