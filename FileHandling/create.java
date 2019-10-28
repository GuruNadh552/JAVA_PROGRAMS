import java.io.*;
class create
{
	public static void main(String[] args) {
		File guru = new File("guru.txt");
		try
		{
			if (guru.createNewFile())
				System.out.println("File Created "+guru.getName());
			else
				System.out.println("File Already Exists");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}