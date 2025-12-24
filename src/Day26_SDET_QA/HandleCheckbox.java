package Day26_SDET_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		// select all checkbox
	List<WebElement> chkbox =	driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	//Approach -1
	
//	for(WebElement chkba : chkbox) {
//		
//		chkba.click();
//	}
	
//	for(int i=0;i<chkbox.size();i++) {
//		
//		chkbox.get(i).click();
//	}
	
	//select last 2 check box out of 3
	
	for(int i=0;i<3;i++) {
		
		chkbox.get(i).click();
	}
	
	Thread.sleep(2000);
	
	for(int i=0;i<chkbox.size();i++) {
		if(chkbox.get(i).isSelected())
		{
		chkbox.get(i).click();
		}
	}
	}

}
