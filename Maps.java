package d2;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
		
		Map<String,Integer > info = new HashMap<String ,Integer>();
		
		info.put("football", 100);
		info.put("basketball", 30);
		info.put("tennis", 20);
		info.put("hockey", 60);
		info.put("Archery", 40);
		
		for(Map.Entry<String,Integer> mapEnt : info.entrySet()) {
			System.out.println(mapEnt.getKey() + ":" + mapEnt.getValue());
		}
		
		
		info.replace("basketball", 50);
		System.out.println("************  updated ************");
		
		for(Map.Entry<String,Integer> mapEt : info.entrySet()) {
			System.out.println(mapEt.getKey() + ":" + mapEt.getValue());
		}
		
		
		
		
		
	}
}