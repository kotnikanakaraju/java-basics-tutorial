import java.util.Scanner;
class d1 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("enter the starting");
		int start=s.nextInt();
		System.out.println("enter the ending");
		int end=s.nextInt();
		int m=1;
		while(start<=end)
		{
			System.out.println(start+"*"+m+"="+start*m);
			Thread.sleep(150);
			m++;
			if(m==6)
			{
				System.out.println("***************************");
				start++;
			}
			if(m==11)
			{
				break;
			}
	}
}
}

class d3
 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	 {
		System.out.println("enter the number");
		int counts=0;
		int number=s.nextInt();
		do
		{
			number=number/10;
			counts++;
			
		}
		 while (number>0);
 System.out.println("the total number of digits are:"+counts);
	}
	
}







class d2
{
	public static void main(String[] args)
	{
		int a=100;
		System.out.println("the numbers from 1 to 10 which are divisible by 4 and 6 are:");
		do{
			if(a%4==0&&a%6==0)
			{
			System.out.println(a);
			}
			a--;
		}
		while(a>=1);
	}
}






