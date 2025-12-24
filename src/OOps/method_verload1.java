package OOps;

public class method_verload1 {

	void ladka(int a,int b) {
		
		System.out.println(a+b);
	}
	
void ladka(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		

		method_verload1 ml = new method_verload1();
		ml.ladka(5, 10);
		ml.ladka(5, 50,90);
	}

}
