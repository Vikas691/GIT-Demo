package Day26_SDET_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--headless=new");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com");

		String act_title = driver.getTitle();

		if (act_title.equals("Facebook- log in or sign up")) {

			System.out.println("Test passed");
		} else {
			System.out.println("Test faiiled");
		}
		driver.quit();

	}

}
