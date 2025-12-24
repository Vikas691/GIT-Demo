package OOps;
import java.util.HashSet;

public class duplicate_arrray {

	public static void main(String[] args) {
		
		

		


		      int arr[] = {1, 2, 5, 7, 9, 10};

		        HashSet<Integer> set = new HashSet<Integer>();

		        for (int i : arr) {
		            if (!set.add(i)) {
		                System.out.println("Duplicate: " + i);
		            }
		        }
		    }
		

	

}
