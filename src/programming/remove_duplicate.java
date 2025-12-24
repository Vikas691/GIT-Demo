package programming;

import java.util.HashSet;
import java.util.Set;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,3,2,2,2,2};
		
		Set<Integer> unique = new HashSet<Integer>();
		
		for(int num: arr) {
			
			unique.add(num);
		}
		
		System.out.println("Array after removing duplicates"+unique);
	}

}
