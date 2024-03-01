import java.util.*;

class Company implements Comparable{
	
	String compName = null;
	float rev = 0.0f;
	
	Company(String compName, float rev){
		
		this.compName = compName;
		this.rev = rev;
	
	}	
		public int compareTo(Object obj){
			
			return (compName.compareTo(((Company)obj).compName));
		}
		public String toString(){
			
			return compName;
		}
}
class TreeSetDemo3{
	
	public static void main(String[] args){
		
		TreeSet ts = new TreeSet();
		
		ts.add(new Company("Infosys",130.00f));
		ts.add(new Company("IBM",230.00f));
		ts.add(new Companyk("C2W",330.00f));
		ts.add(new Company("Cognizant",240.00f));
		
		System.out.println(ts);
	}
}