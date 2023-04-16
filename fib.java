class fib
{
	public static void main(String[] args) 
	{
		int n1=10,n2=9,n3=0;
		System.out.println(n1+" "+n2+" ");
		for (int i=1;i<=8 ;i++ )
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3+" ");
		}
	}
}
