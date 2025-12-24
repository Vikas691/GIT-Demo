package Day26_SDET_QA;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//get (url) -  open the url on browser
		driver.get("https://www.facebook.com");
		
		//get title--- return title of the page

		System.out.println(driver.getTitle());
		
		
		//get currenturl()- return url of the page
		System.out.println(driver.getCurrentUrl());
		
		//getpageSource() -- return source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowhandle - return id of the single browser window
		
		String windowid = driver.getWindowHandle();
		System.out.println("window iD:" +windowid);
		
		//getwindowhandles() - return iD's of the multiple browser window
	
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowid);
	
	}

}
