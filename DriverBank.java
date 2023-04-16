class DriverBank//end user 
{
	public static void main(String[] args) 
	{
		Bank ref=new Icici();
		System.out.println("Intial bal:"+ref.bal);
		ref.deposite(1000);
		ref.withdraw(500);
		System.out.println("Hello World!");
	}
}
