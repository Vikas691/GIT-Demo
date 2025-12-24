package programming;

public class FIBONCAI_RECURSION {

	
	static int a=0,b=1,c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a+"  "+b);
		FIBONCAI_RECURSION fr = new FIBONCAI_RECURSION();
		fr.rksn(10);
		
		
	}
	
	void rksn(int i) {
		
		if(i>=0) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			rksn(i-1);
		}
	}

}
