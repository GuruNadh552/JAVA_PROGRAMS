class except
{
	public static void main(String[] args) {
		int i,d;
		try
		{
			d = 0;
			i = 42/d;
			System.out.println("Not Printed");
		}
		catch (Exception e) {
			System.out.println(e);			
		}
		finally
		{
			System.out.println("Program Completed");
		}
	}
}