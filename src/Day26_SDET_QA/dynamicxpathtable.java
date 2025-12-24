package Day26_SDET_QA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicxpathtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	List<WebElement> tbl =	   driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody//tr//td"));
	
	System.out.println("all companies size:"+tbl.size());
	}

}
