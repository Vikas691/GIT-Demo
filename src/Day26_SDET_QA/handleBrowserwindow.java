package Day26_SDET_QA;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowserwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Browse Courses')]")).click();

		// driver.get("https://courses.rahulshettyacademy.com/l/products?sortKey=recommended&sortDirection=asc&page=1");

		Set<String> windowID = driver.getWindowHandles();

////Approach-1
//		List<String> windowlist = new ArrayList<String>(windowID);
//
//		String parentID = windowlist.get(0);
//		String childid = windowlist.get(1);
//
////switch to childwindow
//		driver.switchTo().window(childid);
//		System.out.println(driver.getTitle());
//
////switch to parent window
//		driver.switchTo().window(parentID);
//		System.out.println(driver.getTitle());
		
		//Approach -2
		for(String windId: windowID) {
			
			String title = driver.switchTo().window(windId).getTitle();
			
			
			if(title.equals("Rahul Shetty Academy"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	}

}
