package Day26_SDET_QA;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateall {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
		
		
	//	driver.navigate().to("https://www.facebook.com");
	//driver.navigate().to("https://www.google.com");
	
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	}
}
