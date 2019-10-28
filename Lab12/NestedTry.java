import java.util.*;
class NestedTry
{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int[] arr;
		int a,x;
		arr = new int[10];
		x = n.nextInt();
		try
		{
			a = 42/x;
			try
			{
				arr[11] = 10;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
	}
}