package OOps;

public class Polymorphism_Method_overloading {

	void Show(int a) {
		
		System.out.println("01");
	}
	
	
	void Show(String a,int b) {
		System.out.println("2");
	}
	
	
	public static void main(String[] args) {
		
		Polymorphism_Method_overloading pt = new Polymorphism_Method_overloading();
		pt.Show(10);
		

	}

}
