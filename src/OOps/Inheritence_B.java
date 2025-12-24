package OOps;

public class Inheritence_B extends Inheritence_A{

	void ShowB() {
		
		System.out.println("ihertience b is b");
	}
	
	public static void main(String[] args) {
		
		Inheritence_B  ib = new Inheritence_B();
		ib.ShowA();
		ib.ShowB();
		
		Inheritence_A ia = new Inheritence_A();
		ia.ShowA();
	}

}
