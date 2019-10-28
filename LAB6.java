import java.util.Scanner;
class LAB6
{
	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
			
			String s;
			s = scan.nextLine();
			String s1 ;
			s1= "huru";
			System.out.print("Length of the String is "+(s.length()));
			System.out.println(s.compareTo(s1));
			System.out.println(s1.concat(s));
			System.out.println(s.isEmpty());
			String s2 = s1.toLowerCase();
			System.out.println(s2);
			System.out.println(s2.toUpperCase());
			System.out.println(s2.replace('h','g'));
			System.out.println(s2.contains("guru"));
	}
}