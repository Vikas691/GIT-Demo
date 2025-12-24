package Day26_SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");

		driver.manage().window().maximize();

		String text = driver.findElement(By.xpath("//div[contains(text(),'entries')]")).getText();

		// int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+
		// 1,text.indexOf("entries")- 1));

		String total = text.split("of")[1].replace("entries", "").trim();
		int total_pages = Integer.parseInt(total);

		for (int p = 1; p <= total_pages; p++) {
			if (p > 1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + p + "]"));
				active_page.click();
				Thread.sleep(3000);
			}

			// reading data from the page
			int noofrows = driver
					.findElements(By.xpath(
							"//table[@class='table table-striped table-bordered dataTable no-footer']//tbody//tr"))
					.size();

			for (int r = 1; r <= noofrows; r++) {

				String cname = driver.findElement(
						By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']//tbody//tr["
								+ r + "]/td[2]"))
						.getText();

				String eml = driver.findElement(
						By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']//tbody//tr["
								+ r + "]/td[3]"))
						.getText();

				String mol = driver.findElement(
						By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']//tbody//tr["
								+ r + "]/td[4]"))
						.getText();

				System.out.println(cname + "\t" + eml + "\t" + mol + "\t");
			}
		}
	}

}
