package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpthamazon {
	ChromeDriver obj;
	@Before
	public void setup()
	{
		obj=new ChromeDriver();
		obj.get("https://www.amazon.in");
		}
	@Test
	public void amazon()
	{
		obj.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		obj.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		obj.findElement(By.xpath("//div[@class='nav-fill']//a[4]")).click();
		obj.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
}
	}