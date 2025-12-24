package OOps;

public class Inheritence_C extends Inheritence_A {

	
	void ShowC() {
		
		System.out.println("this is the C");
	}
	public static void main(String[] args) {
		
		Inheritence_B ib = new Inheritence_B();
		ib.ShowA();
		ib.ShowB();
		
		Inheritence_A ia = new Inheritence_A();
		ia.ShowA();
		
		
		Inheritence_C ic = new Inheritence_C();
		ic.ShowC();
		ic.ShowB();
		ic.ShowA();
		

	}

}
