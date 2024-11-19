package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralappt {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void Keralalogin()
	{
		driver.findElement(By.id("ulogin")).sendKeys("akhil");
		driver.findElement(By.name("upass")).sendKeys("adgu233");
		driver.findElement(By.id("sub_logbtn")).click();
	}
}
