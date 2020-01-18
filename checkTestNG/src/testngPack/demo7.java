package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class demo7 {
	
	@Test(enabled = false)
	public void a()
	{
		System.out.println("a1");
	}
	
	@Test
	public void b()
	{
		System.out.println("b2");
	}
	
	@Test
	public void c()
	{
		System.out.println("c2");
		//checking some condition here and then 
		throw new SkipException("any message");
	}
	
	
}
	


