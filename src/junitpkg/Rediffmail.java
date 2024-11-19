package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
	}
	@Test
	public void logo()
	{
		WebElement redifflogo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr/td/img"));
		boolean l=redifflogo.isDisplayed();
		if(l)
		{
			System.out.println("logo is present");
		}
		else {
			System.out.println("logo is not present");
		}
	}
}
