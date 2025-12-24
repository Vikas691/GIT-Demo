package programming;

public class Descending_Arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rr[] = {1,2,3,4,5,5,6,7,8,9,9,9,9,0};
		int temp;
		
		for(int i=0;i<rr.length;i++) {
			
			for(int j=i+1;j<rr.length;j++) {
				
				if(rr[i]<rr[j]) {
					
					temp = rr[i];
					rr[i] = rr[j];
					rr[j] = temp;
					
				}

				
			}
		}
				System.out.println("array in desceding order:");
			
				for(int num : rr) {
					
					System.out.println(num);
					
				}
	}

}
