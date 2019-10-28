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
class C extends A
{
	void show2()
	{
		System.out.println("It is class C");
	}
}
class Hiearchical
{
	public static void main(String[] args) {
		C d = new C();
		d.show();
		d.show2();

		B f = new B();
		f.show1();
		f.show();
	}
}