class A
{
	void show()
	{
			System.out.println("It is Class A");
	}
}
class B extends A
{
	void show1()
	{
		System.out.println("It is class B");
	}
}
class C extends B
{
	void show2()
	{
		System.out.println("It is class C");
	}
}
class Multilevel
{
	public static void main(String[] args) {
		C d = new C();
		d.show();
		d.show1();
		d.show2();
	}
}