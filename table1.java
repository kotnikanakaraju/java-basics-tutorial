import java.util.*;
class  Table
{
	static Scanner s= new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter a number :");
		int tab=s.nextInt();
		int m=1;
		while(m<=10){
			System.out.println(tab + "*" + m + "=" + (m*tab));
			Thread.sleep(1000);
			m++;
		}



	}
}
