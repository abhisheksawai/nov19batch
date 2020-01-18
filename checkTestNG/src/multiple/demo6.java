package multiple;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo6 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("@beforeclass");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("@@AfterClass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("@@AfterMethod");
	}
	
	@BeforeTest
	public void tcstarted()
	{
		System.out.println("tc exe started------------------------------");
	}
	
	@AfterTest
	public void tcexeDone()
	{
		System.out.println("tc exe tcexeDone-----------------------------------");
	}
	
	@Test
	public void a()
	{
		System.out.println("a3");
	}
	
	@Test
	public void b()
	{
		System.out.println("b4");
	}
	
}
	


