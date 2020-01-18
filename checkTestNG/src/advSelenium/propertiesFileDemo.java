package advSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class propertiesFileDemo {
	
	@Test
	public void ordemo() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\all unzip file nov\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");	
		System.out.println("launched");
		
		
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass");
		
		File src = new File("E:\\World Of Program\\checkTestNG\\OR.properties");
		FileInputStream fis = new FileInputStream(src);		
		
		Properties p = new Properties();
		p.load(fis);
				
		driver.get(p.getProperty("uat_urlfacebook"));	
		driver.findElement(By.xpath(p.getProperty("txt_username_facebook"))).sendKeys("9403224455");			
		driver.findElement(By.xpath(p.getProperty("txt_password_fb"))).sendKeys(p.getProperty("testdata_password_fb"));
		
		
		System.out.println("entered password");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
