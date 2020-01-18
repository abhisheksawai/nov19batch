package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo6 {
	
	@Test(priority=-1)
	public void e()
	{
		System.out.println("e-1");
	}
	@Test(priority=-2)
	public void f()
	{
		System.out.println("f-2");
	}
	
	@Test(priority=1)
	public void d()
	{
		System.out.println("d1");
	}
	
	@Test
	public void z()
	{
		System.out.println("c-z");
	}
	
	@Test(priority=3)
	public void a()
	{
		System.out.println("a3");
	}
	
	@Test(priority=4)
	public void b()
	{
		System.out.println("b4");
	}
	
	
	
	
}
	


