import java.io.*;
class fileMethods
{
	public static void main(String[] args) {
		File guru = new File("guru.txt");
		if (guru.exists())
		{
			System.out.println("File Name = "+guru.getName());
			System.out.println("Absolute path = "+guru.getAbsolutePath());
			System.out.println("Writable = "+guru.canWrite());
			System.out.println("Readable = "+guru.canRead());
			System.out.println("Lenght = "+guru.length());
		}
		else
			System.out.println("File Doesnt Exists");
	}
}