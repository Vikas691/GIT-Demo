package Day26_SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.nopcommerce.com/register");
	//	driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		// isDisplayed()
		
//	WebElement	Logo = driver.findElement(By.xpath("//img[@title='nopCommerce']"));
//	
//	System.out.println("Display status of logo:"+Logo.isDisplayed());
	
//	boolean status = driver.findElement(By.xpath("//img[@title='nopCommerce']")).isDisplayed();
//	System.out.println("Display status:"+status);
	
	// isEnabled()
	
//boolean txt =	driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//	
//	System.out.println("enabld is:"+txt);
	
	// isSelected()
	
WebElement female_rd =	driver.findElement(By.xpath("//label[normalize-space()='Female']"));
WebElement male_rd = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	}
	

}
