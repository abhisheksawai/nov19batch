package advSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyloginpage {	
	
	@Test
	public void verifylogin()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\all unzip file nov\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		
		loginpage login = new loginpage(driver);		
		login.typeusername("passinguserid");
		login.typepassword();
		login.clickonlogin();		
		
		
	}
	
	
	
}
