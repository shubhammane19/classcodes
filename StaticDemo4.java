class StaticDemo4{
	
	static{
		
		System.out.println("Static block 1");
	}
	public static void main(String[] args){
		
		System.out.println("In Demo main");
	}
}
class Client4{
	
	static{
		
		System.out.println("Static block2");
	}
	public static void main(String[] args){
		
		System.out.println("In Demo main2");
	}
	static{
		
		System.out.println("In static block 3");
	}
}