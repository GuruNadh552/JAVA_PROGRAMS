class ASS5
{
	public static void main(String args[])
	{
		int n,i,s;
		n=14;
		s=0;
		for (i=1;i<=n;i++)
		{
			if (i%4==0)
				s=s-i;
			else
				s=s+i;
		}
		System.out.print(s);
	}
}
