package programming;

public class Leap_Year_2ndlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2012;
		
		if((year%4==0 || year%100!=0) && year%400==0){
			
			System.out.println("Leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

//		int year =1900;
//		
//		if(year%4==0)
//		{
//			System.out.println("Leap year");
//		}
//		else {
//			System.out.println("not a leap");
//		}
		
	}
	
