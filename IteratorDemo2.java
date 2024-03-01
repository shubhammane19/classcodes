import java.util.*;

class IteratorDemo2{
	
	public static void main(String[] args){
		
		ArrayList al = new ArrayList();
		
		al.add("Ashish");
		al.add("Rahul");
		al.add("Kanha");
		al.add("Badhe");
		
		for(var x: al){
			
			System.out.println(x.getClass().getName());
		}
		Iterator cursor = al.iterator();
		
		while(cursor.hasNext()){
			
			if("Kanha".equals(cursor.next()))
				cursor.remove();
		}
		System.out.println(al);
	ListIterator litr = al.listIterator();
	
	while(litr.hasNext()){
		
		System.out.println(litr.next());
	}
	while(litr.hasPrevious()){
		
			System.out.println(litr.previous());
		}
	}
}