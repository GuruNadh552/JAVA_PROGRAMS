import java.util.Scanner;
class emp
{
	String[] empid;
	float[] Bs;
	int n,i;
	float Da,Hra,Ta,Pt,It,caa;
	void red()
	{
		Scanner input = new Scanner (System.in);
		Scanner inp = new Scanner (System.in);
		Scanner inpu = new Scanner (System.in);
		System.out.println("Enter No of Empolyees :");
		n = input.nextInt();
		empid = new String[n];
		Bs = new float[n];
		for (i=0;i<n;i++)
		{
			System.out.println("Enter Empolyee naMe : ");
			empid[i]=inp.nextLine();
			System.out.println("Enter Basic Salary : ");
			Bs[i]=inpu.nextFloat();
		}
	}
	void dis()
	{
		for (i=0;i<n;i++)
		{

		System.out.println("----------------------------------------------");
			Da = (12*Bs[i])/100;
			Hra =(15*Bs[i])/100;
			Pt = (14*Bs[i])/100;
			It = (10*Bs[i])/100;
			Ta = Pt+It;
			if (Bs[i]>500000)
				caa = (Bs[i]+Da+Hra+500)-(Ta);
			else
				caa = (Bs[i]+Da+Hra+500);
			System.out.println("Empolyee = "+empid[i]);
			System.out.println("Basic Salary = "+Bs[i]);
			System.out.println("Net Salary = "+caa);

		System.out.println("----------------------------------------------");
		}
	}
}
class A1
{
	public static void main(String[] args) 
	{
	
	emp emo = new emp();
	emo.red();
	emo.dis();

	}

}