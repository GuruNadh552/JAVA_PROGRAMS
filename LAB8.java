import java.util.Scanner;
class LAB8 
{
	static int fact(int x)
	{
		if (x==0)
			return 1;
		else
			return x*fact(x-1);
	}
	public static void main(String[] args) {
	
	int n,b;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a Number");
	n = in.nextInt();
	b=fact(n);
	System.out.println("Factorial of "+n+"is "+b);	
	}
}