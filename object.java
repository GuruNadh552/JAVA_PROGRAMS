import java.util.Scanner;
class BOX
{
	String name;
	int id;
	int m1,m2,m3;
}
class object
{
	public static void main(String[] args) {
		int d;
		BOX B1 = new BOX();
		BOX B2 = new BOX();
		/*B1.a=10;
		B1.b=15;
		B1.c=20;
		d=B1.a*B1.b*B1.c;
		System.out.println(d);
		B2.a=5;
		B2.b=6;
		B2.c=7;
		d=B2.a*B2.b*B2.c;
		System.out.println(d);*/
		Scanner input = new Scanner(System.in);
		Scanner inpu = new Scanner(System.in);
		System.out.println("Enter Id No :");
		B1.id = input.nextInt();
		System.out.println("Enter NAme :");
		B1.name = inpu.nextLine();
		System.out.println("Enter Three Mid Marks");
		B1.m1=input.nextInt();
		B1.m2=input.nextInt();
		B1.m3=input.nextInt();

		System.out.println("Enter Id No :");
		B2.id = input.nextInt();
		System.out.println("Enter NAme :");
		B2.name = inpu.nextLine();
		System.out.println("Enter Three Mid Marks");
		B2.m1=input.nextInt();
		B2.m2=input.nextInt();
		B2.m3=input.nextInt();

		System.out.println("-----------------------------------");
		System.out.println(" ");
		System.out.println("	Student Name = "+B1.name);
		System.out.println(" ");
		System.out.println("	Student Id = "+B1.id);
		System.out.println(" ");
		System.out.println("	Mid Marks = "+B1.m1+","+B1.m2+","+B1.m3);
		System.out.println(" ");
		System.out.println("-----------------------------------");

		System.out.println(" ");
		System.out.println("	Student Name = "+B2.name);
		System.out.println(" ");
		System.out.println("	Student Id = "+B2.id);
		System.out.println(" ");
		System.out.println("	Mid Marks = "+B2.m1+","+B2.m2+","+B2.m3);
		System.out.println(" ");
		System.out.println("-----------------------------------");
	}
}