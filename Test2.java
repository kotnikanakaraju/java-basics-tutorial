class Test2 
{
	int a=10;
	static Test2 ref=new Test2();
	public static void test(){
		System.out.println("hi iam test");
	}
	public static void main(String[] args) 
	{
		//static context
		System.out.println(ref.a);
		System.out.println("Hello World!");
	}
	static
	{
		Test2.ref.test();
		ref.test();
	}
}
