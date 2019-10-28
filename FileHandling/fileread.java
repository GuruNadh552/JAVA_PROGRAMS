import java.io.*;
import java.util.*;
class fileread
{
	public static void main(String[] args) {
		try
		{
			FileReader file = new FileReader("guru.txt");
			Scanner guru = new Scanner(file);
			while (guru.hasNextLine())
			{
				String g = guru.nextLine();
				System.out.println(g);
			}
			guru.close();
			System.out.println("Read SuccessFully");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}
}