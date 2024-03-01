import java.io.*;

class IntegermustException extends RuntimeException{
	
	IntegermustException(String msg){
		super(msg);
	}
}

class Client{
	
	public static void main(String[] args)throws IOException,NumberFormatException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Passcode:");
		
		String str = br.readLine();
		
		//System.out.println(str);
		String str2 = "Shubham";
		
		//int pass = 0;
		
		//int pass = Integer.parseInt(br.readLine());
			
			if(str != str2){
				throw new IntegermustException("Please enter valid passcode");
			
			}
			String str3 = br.readLine();
			System.out.println(str3);
		}
}
