interface MyInterface
{
   public void method1();
   public void method2();
}
class InterFace implements MyInterface
{
   public void method1()
   {
	   System.out.println("This Is Method 1");
   }
   public void method2()
   {
	   System.out.println("This is Method 2");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new InterFace();
	obj.method1();
   obj.method2();
   }
}