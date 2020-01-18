package advSelenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logforjtc {
	
	@Test
	public void logforjtestcase()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\all unzip file nov\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Logger log = Logger.getLogger("log demo");
		PropertyConfigurator.configure("log4j.properties");	
		driver.get("https://www.facebook.com/");	
		log.info("-------------Exeuction Started------------------------");
		log.info("browser launch 11");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("userid");
		log.info("enterted username");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("userid");
		log.info("enterted pass");
	}

}
