import java.util.*;

class DataOverFlowException extends RuntimeException{
	
	DataOverFlowException(String msg){
		super(msg);
	}
}
class DataUnderFlowException extends RuntimeException{
	
	DataUnderFlowException(String msg){
		super(msg);
	}
}
class ArrayDemo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter Integer values");
		System.out.println("Note: 0 < Element < 100");
		for(int i = 0; i<arr.length; i++){
			
			int data = sc.nextInt();
			if(data < 0)
				throw new DataUnderFlowException("Bhao data 0 peksha chota ahe");
			if(data>100)
				throw new DataOverFlowException("Bhao data 100 peksha motha ahe");
			arr[i] = data;
		}
		for(int i = 0; i<arr.length;i++){
			
			System.out.println(arr[i] +" ");
		}
	}
}