import java.util.*;
class arm_strong 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int num=s.nextInt();
		int last=0,count=0,product=1,sum=0,temp=num;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		temp=num;
		while (num>0)
		{
			last=num%10;
			for (int i=1;i<=count ;i++ )
			{
				product=product*last;
			}
			//ading the powers
			sum=sum+product;
			product=1;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println("arm_strong number");
		}else{
			System.out.println("not arm strong number");
		}
	}
}
