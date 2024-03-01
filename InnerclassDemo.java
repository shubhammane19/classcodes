class Outer{
	
	int x = 10;
	static int y = 20;
	
	static class Inner{
		
		final static int a = 30;
	}
	void m2(){
		
		System.out.println("In m2");
	}
}
class Client1{
	
	public static void main(String[] args){
		
		System.out.println(Outer.y);
		Outer obj = new Outer();
		System.out.println(obj.x);
		obj.m2();
		
		Outer.Inner obj2 = obj.new Inner();
		System.out.println(obj2.new Inner().a);
	}
}