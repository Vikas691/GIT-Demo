package programming;

public class factorial_rec {

	
	int fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no =5, res;
		factorial_rec fc = new factorial_rec();
		res = fc.callfact(no);
		System.out.println(res);
	}
	int callfact(int no) {
		
		if(no>1) {
			
			fact = fact*no;
			callfact(no-1);
			return fact;
		}
		
	}

}
