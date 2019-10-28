import java.util.Scanner;
class LAB4
{
	public static void main(String[] args) {
		int i,j,c;
		int[] arr;
		Scanner input = new Scanner (System.in);
		arr = new int[5];
		System.out.println("Enter Elements of Array");
		for (i=0;i<arr.length;i++)
				arr[i] = input.nextInt();
		System.out.println("**** Elements of Array ****");
		for (i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		for (i=0;i<arr.length;i++)
		{
			for (j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					c = arr[i];
					arr[i]= arr[j];
					arr[j]= c;
				}
			}
		}
		System.out.println("After Sorting the Array");
		for (i=0;i<arr.length;i++)
				System.out.println(arr[i]);
	}
}