package OOps;

import java.util.HashSet;

//
//public class methodoverride2  {

//	public void eat() {
//		System.out.println("eating again");
//	}
	
	
	public static void main(String[] args) {
		
//		methodoverride2 m2 = new methodoverride2();
//		
//		methodoverride1 m1 = new methodoverride1();
//	m1.eat();
	
	
		 int arr[] = {1,2,5,7,9,10};
	     
	     HashSet<Integer> set = new HashSet<Integer>();
	     
	     for(int i : arr){
	         if(!set.add(i)) {
	        	 System.out.print("DDuplicate:"+i);
	         }
	     }
	}

}
