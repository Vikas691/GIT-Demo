package programming;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringfind {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(char c : str.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
			
		for(char c : map.keySet()) {
			
			if(map.get(c) > 1)
				
				System.out.println(c+ "-->"+map.get(c));
		}

	}

}
