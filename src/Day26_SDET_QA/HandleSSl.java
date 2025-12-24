package Day26_SDET_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		//handle ssl
	//	options.setAcceptInsecureCerts(true);
		//handlee  cherome is being automated this line
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver =new ChromeDriver(options);
		
		 driver.get("https://expired.badssl.com");
	System.out.println(driver.getTitle());
	}

}
