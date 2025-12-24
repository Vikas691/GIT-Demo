package Testngg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class check_ano1 {

	
	
	@AfterTest
	void teest() {
		System.out.println("After test hai bro");
	}
	
	@Test
	void karma() {
		System.out.println("execution karma h bro");
	}
}
