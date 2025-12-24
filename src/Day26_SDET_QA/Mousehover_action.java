package Day26_SDET_QA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_action {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.get("https://krishinivesh.gov.in/#/");

		// driver.get("https://www.facebook.com");

		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();

		// WebElement mc = driver.findElement(By.xpath("//a[contains(text(),'Media
		// Corner')]"));

//WebElement au = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));

//WebElement tau = driver.findElement(By.xpath("//div[contains(text(),' for a celebrity, brand or business.')]"));
		WebElement box = driver.findElement(By.xpath("//div[@class='dragged']"));
		WebElement imabe = driver.findElement(By.xpath("//div[@id=\"dragarea\"]//img[@id=\"node\"]"));

		WebElement mon = driver.findElement(By.xpath("//div[@id=\"dragarea\"]//img[@id=\"mongo\"]"));

		WebElement one = driver.findElement(By.xpath("//div[@id=\"dragarea\"]//img[@id=\"angular\"]"));

		
		Actions act = new Actions(driver);

//mouse hover action
		// act.moveToElement(au).perform();

		// right click
		// act.contextClick(au).perform();

		// double click
		// act.doubleClick(tau).perform();

		// drag and drop

		act.dragAndDrop(imabe, box).perform();

		act.dragAndDrop(mon, box).perform();
		
		act.dragAndDrop(one, box).perform();
	}

}
