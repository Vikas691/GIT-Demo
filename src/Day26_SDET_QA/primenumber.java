package Day26_SDET_QA;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int num=2;num<=100; num++) {
			
			boolean isPrime = true;
			
			for(int i=2;i<=Math.sqrt(num);i++) {
				
				if(num%i==0) {
					isPrime = false;
					break; 
				}
			}
			if(isPrime) {
				System.out.println(num+"");
			}
		}
	}

}
