import java.util.*;
class MultiCatch
{
	public static void main(String[] args) {
		Scanner n = new Scanner (System.in);
		int x,a;
		x = n.nextInt();
		int arr[]={1};
		try
		{
			a = 12/x;
			System.out.println(a);
			arr[2]=4;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}