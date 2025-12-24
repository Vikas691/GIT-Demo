package Day26_SDET_QA;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

//		//1) full page screenshot
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//		// File targetfile = new
//		// File("C:\\Users\\vikas\\eclipse-workspace\\Programming_smart\\screenshots");
//
//		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\ss.png");
//		sourcefile.renameTo(targetfile);

		// 2) capture the screenshot of specific section
//		WebElement featuredproduct = driver.findElement(By.xpath("//div[@class='_8iep _8icy _9ahz _9ah-']"));
//		File SOURCEFILE = featuredproduct.getScreenshotAs(OutputType.FILE);
//
//		File TARGETFILE = new File(System.getProperty("user.dir")+"\\screenshots\\ftr.png");
//		SOURCEFILE.renameTo(TARGETFILE);


	// 3) capture the screenshot of webelement
	
  WebElement logo =	driver.findElement(By.xpath("//img[@alt='Facebook']"));
File sourcefile = logo.getScreenshotAs(OutputType.FILE);
File targetfile = new File(System.getProperty("user.dir")+"//screenshots//htr.png");

sourcefile.renameTo(targetfile);
  
  
  
  
	}
	
}
