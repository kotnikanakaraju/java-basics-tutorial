class gfg
{
	static String sw_name;
	static float sw_price;
	static String sw_review;

	static void set(String n,float p,String r){
		sw_name=n;
		sw_price=p;
		sw_review=r;
	}

	static void get(){
		System.out.println("Software name:"+sw_name);
		System.out.println("software price:"+sw_price);
		System.out.println("software review:"+sw_review);
	}
	public static void main(String[] args) 
	{
		gfg.set("visual_studio",45000.00f,"good");
		gfg.get();
		System.out.println("Hello World!");
	}
}
