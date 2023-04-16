import java.util.Scanner;
class for 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the num");
		int num=s.nextInt();
		int temp=num;
		for(int count=1;count<temp;count++)
		{
			
           temp=temp/10;
		}
	}
}
