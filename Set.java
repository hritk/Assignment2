package d2;
import java.util.*;


public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> animals = new TreeSet<String>();
		
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Zebra");
		animals.add("Deer");
		animals.add("Hyena");
		animals.add("Giraffe");
		animals.add("Racoon");
		animals.add("Lion");
		animals.add("Leopord");
		
		Iterator<String> itr = animals.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
