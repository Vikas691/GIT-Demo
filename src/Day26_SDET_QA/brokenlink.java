package Day26_SDET_QA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://krishinivesh.gov.in/#/");
		
		driver.manage().window().maximize();
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	System.out.println("total number of links"+links.size());
	int noofbrokenlink=0;
	
	for(WebElement linkele : links)
	{
		String hrefvalue = linkele.getAttribute("href");
		
		if(hrefvalue==null || hrefvalue.isEmpty())
		{
			System.out.println("href attribute is null or empty so not possible to check");
		continue;
		}
		try
		{
		URL linkurl = new URL(hrefvalue);
		HttpURLConnection con =(HttpURLConnection) linkurl.openConnection();
		con.connect();
		
	if	(con.getResponseCode()>=400) {
		System.out.println("broken link");
	}
	else 
	{
		System.out.println("not a broken link");
	}
		}
		catch(Exception e)
		{
			
		}
		
	}
		
	System.out.println("no of broken links"+noofbrokenlink);
	}

}
