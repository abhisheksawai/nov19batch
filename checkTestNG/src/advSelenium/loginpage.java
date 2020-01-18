package advSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
		By usernname=By.xpath("//input[@type='email']");
		By password=By.xpath("//input[@type='password']");
		By loginbutton=By.xpath("//*[@id='wp-submit']");
		WebDriver driver;
	
		public loginpage(WebDriver driver) {
			this.driver = driver;
		}

		public void typeusername(String userid){
			driver.findElement(usernname).sendKeys(userid);
		}
	
		public void typepassword(){
			driver.findElement(password).sendKeys("demo123");
		}
	
		public void clickonlogin()	{
			driver.findElement(loginbutton).click();
		}

}
