package Day26_SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

		System.out.println(driver.switchTo().defaultContent());

		// Frame 2

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

		driver.switchTo().frame(frame2);

		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");

		System.out.println(driver.switchTo().defaultContent());

		// Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

		driver.switchTo().frame(frame3);

		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("selenium");

		System.out.println(driver.switchTo().defaultContent());

		//inner iframe - part of 
		
		driver.findElement(By.xpath("//div[@class='rseUEf nQOrEb']")).click();
	}

}
