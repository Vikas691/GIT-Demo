package Day26_SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1)scroll down the page by pixel number

		// js.executeScript("window.scrollBy(0,3000)","" );
//	System.out.println(js.executeScript("return window.pageYOffset;"));

		// 2) scroll the page till the element is visible
//		WebElement ele = driver.findElement(By.xpath("//td[contains(text(),'Turkey')]"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));

		//3) scroll down till end of the page
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		
		//scrolling up to intial postion
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

}
