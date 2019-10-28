import java.io.*;
class filewrite
{
	public static void main(String[] args) {
		try
		{
			FileWriter file = new FileWriter("guru.txt");
			file.write("Hello World");
			file.close();
			System.out.println("Wrote SuccessFully");
		}
		catch (Exception e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}
}