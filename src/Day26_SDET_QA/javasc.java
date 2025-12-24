package Day26_SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class javasc {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
	//	ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@name='email']"));
		
	//	javascriptexecutor js = driver;  --when using chromedriver then will use thos
		
		//passing the text into inputbox
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','John')",inputbox);
	
		
	WebElement sbtbtn =	driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()",sbtbtn );
	}

}
