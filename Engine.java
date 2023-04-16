class Engine 
{
	String type,power,cc;
	Engine()
	{
		//li
	}
	Engine(String type,String p,String c){
		this.type=type;
		power=p;
		cc=c;
	}
	public void DetailsOfEngine(){
		System.out.println("diesel:"+this.type);
		System.out.println("horse:"+power);
		System.out.println("cc:"+cc);
	}
}
		
	