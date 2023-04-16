class pt1 
{
	public static void main(String[] args) 
	{
		int n=10;
		char ch='A';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i>=j)
				{
					if (n==8)
					{
						n=4;
						System.out.print(n--+"");
					}
				}else{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		System.out.println("Hello World!");
	}
}
