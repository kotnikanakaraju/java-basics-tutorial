import java.util.Scanner;
class d2
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
			
		}while (number>0);
        System.out.println("the total number of digits are:"+counts);
    }
}

	