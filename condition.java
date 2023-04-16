import java.util.*;
class condition 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int res=s.nextInt();
		if (res>0)
		{
			if((res>0)&&(res%2==0))
			{
				System.out.println("even number");
			}
			else
			{ 
			    System.out.println("odd number");
			}
            System.out.println("the num is positive");
		}
		else
		{
			System.out.println("num is negative");
		}
		System.out.println("bye");
	}
}
