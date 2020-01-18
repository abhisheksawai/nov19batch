package advSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoitdemo {
	
	@Test
	public void upload() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\all unzip file nov\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pdftoexcelonline.com/");	
		
		driver.findElement(By.xpath("//a[text()='Select your file']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\Nov Weekend\\code\\ajinkyasathi.exe");
		
	}

}
