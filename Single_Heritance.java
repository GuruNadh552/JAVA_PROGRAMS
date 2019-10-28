class A
{
	int a=10,b=20;
	void add()
	{
		System.out.println("Sum of "+a+" "+b+" = "+(a+b));
	}
}
class B extends A
{
	int x = 10,y=20;
	void mul()
	{
		System.out.println("Multiplication of "+x+" "+y+" = "+(x*y));
	}
}
class Single_Heritance
{
	public static void main(String[] args) {
		B d = new B();
		d.add();
		d.mul();
	}
}