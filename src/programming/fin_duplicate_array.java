package programming;

public class fin_duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int [] arr = {1,2,2,3,4,5,6,4,7,8,9};
//		
//		System.out.println("Duplicates");
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j= i+1; j<arr.length;j++ ) {
//				
//				if(arr[i]==arr[j]) {
//					
//					System.out.println(arr[i] + "");
//				}
				
//			}
//		}
		
		int [] ar = {1,1,1,2,3,4,5,5,6,7};
		
	for(int i =0;i<ar.length;i++) {
		
		for(int j=i+1;j<ar.length;j++) {
			
			if(ar[i]==ar[j]) {
				
				System.out.println(ar[i]+ "");
			}
		}
	}
	}

}
