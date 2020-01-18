package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class demo9 {
	
	@Test
	public void a()
	{
		System.out.println("a1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Nov Weekend\\all unzip file nov\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.findElement(By.xpath("asdasd")).click();
		
	}
	
	@Test(dependsOnMethods= {"a","c"}  )
	public void b()
	{
		System.out.println("b2");
	}
	
	@Test
	public void c()
	{
		System.out.println("c2");
		//checking some condition here and then 
		//throw new SkipException("any message");
	}
	
	
}
	


