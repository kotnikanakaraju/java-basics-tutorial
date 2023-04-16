import java.util.*;
class  Table
{
	static Scanner s= new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		int cust=s.nextInt();
		int m=1;
		while(m<=10)
		{
			System.out.println(cust+"*"+m+"="+(cust*m));
			m++;
		}
		System.out.println("table satisfied");
	}
}
