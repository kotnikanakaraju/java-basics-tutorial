class Test3 
{
	static int a=10;
	static Test3 ref=new Test3();
	public void m1(){
		System.out.println(a);
		System.out.println(Test3.a);
		System.out.println(ref.a);
	}
	public static void main(String[] args) 
	{
		ref.m1();
		System.out.println("Hello World!");
	}
}
