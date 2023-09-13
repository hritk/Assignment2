package d2;
import java.util.*;

public class List {
	
	public static void main(String[] args) {
		
		ArrayList <String> games = new ArrayList<String>();
		
		games.add("FIFA");
		games.add("BGMI");
		games.add("COD");
		games.add("Fortnite");
		games.add("DOTA");
		games.add("Spiderman");
		games.add("MARIO");
		games.add("NFS");
		games.add("Midtown Madness");
		games.add("POP");
		
		Iterator<String> it = games.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		  
		System.out.println(" ");
		
		
		 boolean ans = games.contains("COD");  //searching 
		 
	        if (ans)
	            System.out.println("The list contains COD");
	        else
	            System.out.println("The list does not contains COD");
	        
	        
	        
	        
	        games.add("FIFA 7");
			games.add("PUBG");
			games.add("OG");
			games.add("FortX");
			games.add("DOTA 2.0");
			
			
			Iterator<String> itr = games.iterator();
			
			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			};
			
			System.out.println(games.subList(0, 2));
		

		   for(int j=0;j<5;j++)
		{
			games.remove(0);
		}
			
			
			
			
			System.out.println(" ");
			
			Iterator<String> itr2 = games.iterator();
			
			
			while(itr2.hasNext()) {
				System.out.print(itr2.next() + " ");
			};
			
			
			
			
			
			
		
	        
	        
	     
		
		 
		 
		 
		 
}
		 


}
