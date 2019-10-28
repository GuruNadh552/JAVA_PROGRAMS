import java.util.Scanner;
class lab7
{
 	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	int a,i,s;
	a = input.nextInt();
	for (i=1;i<11;i++)
	{
		s=a*i;
		System.out.println(a + " * " + i + " = " + s);	
	}
	}
}