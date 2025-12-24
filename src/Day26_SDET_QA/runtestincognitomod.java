package Day26_SDET_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class runtestincognitomod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();

options.addArguments("--incognito");

WebDriver driver = new ChromeDriver(options);

driver.get("https://www.facebook.com");
		
		
	}

}
