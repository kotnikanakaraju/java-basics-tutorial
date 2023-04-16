class A 
{
	int a=10;
	A(){
		//li
		System.out.println("i love india");
	}
	A(int x,String y){
		//li
		System.out.println("hi Iam hero");
	}
}
class B extends A
{
	B(){
		super();
		System.out.println("hi roja");
	}
	B(String s,boolean b){
		super(5,"laxmi");
		System.out.println("love you anjali");
	}
	public static void main(String[] args){
		B bot =new B();
		B bot1=new B("sumitra",true);
		System.out.println(bot);
		System.out.println(bot1);
		System.out.println(bot.a);
	}
}