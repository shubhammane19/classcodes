class StaticDemo2{

	int x = 10;
	static int y = 20;
	
	static{
		
		System.out.println("Static block 1");
	}
	public static void main(String[] args){
		
		System.out.println("Main Method");
		StaticDemo2 obj = new StaticDemo2();
		
		System.out.println(obj.x);
	}
	static{
		
		System.out.println("Static Block 2");
		System.out.println(y);
	}
	
}