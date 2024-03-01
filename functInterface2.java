interface Core2web{
	
	String lang(int numCourse);
}

class Year2023{
	
	public static void main(String[] args){
		
		Core2web c2w = (abc)-> "Bootcamp/java/OS/python" + ":" + abc;
		
		System.out.println(c2w.lang(5));
		
	}
}