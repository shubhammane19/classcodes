interface Core2web{
	
	String lang();
}
class Year2022{
	
	public static void main(String[] args){
		
/*		Core2web c2w = () ->{
			
			System.out.println("Java/Bootcamp/Python/OS");
		};
		c2w.lang();
	}
}
*/
		Core2web c2w = () -> "Java/Bootcamp/Python/OS";
		
		System.out.println(c2w.lang());
	}
}