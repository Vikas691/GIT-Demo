package Day26_SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\vikas\\Downloads\\SELENIUM.docx");
//		
//	if(driver.findElement(By.xpath("//li[contains(text(),'SELENIUM.docx')]")).getText().equals("SELENIUM.docx")) {
//		System.out.println("file is succesfully uploaded");
//	}
//	else {
//		System.out.println("nhi huiiiiiiiii");
//	}
	
	String file1 = "C:\\Users\\vikas\\Downloads\\SELENIUM.docx";
	String file2 =  "C:\\Users\\vikas\\Downloads\\SQL.docx";
	
	
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	
	int noofFilesuploaded = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
	
	if(noofFilesuploaded==2)
	{
		System.out.println("allfiles are uploaded");
	}
	else
	{
		System.out.println("files are not uploaded");
	}
	
	}

}
