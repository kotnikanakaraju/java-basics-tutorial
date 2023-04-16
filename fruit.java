class fruit 
{
	String origin,color,taste;
	fruit(){
		//li
	}
	fruit(String o,String c,String t){
		origin=o;
		color=c;
		taste=t;
	}
}
class Apple extends fruit
{
	String name;
	double price;
	Apple(){
		//super
	}
	Apple(String n,double p,String o,String c,String t){
		super(o,c,t);
		name=n;
		price=p;
	}
	public void detailsOfApple(){
		System.out.println("the origin of apple:"+origin);
		System.out.println("the color of apple:"+color);
		System.out.println("the taste of apple:"+taste);
	}
}