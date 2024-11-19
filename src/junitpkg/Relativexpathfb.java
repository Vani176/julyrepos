package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpathfb {
ChromeDriver obj;
@Before
public void setup()
{
	obj=new ChromeDriver();
	obj.get("https://www.facebook.com");
	}
@Test
public void fblogin()
{
	obj.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	obj.findElement(By.xpath("//input[@id='pass']")).sendKeys("cgsdfyu56");
	obj.findElement(By.xpath("//button[@name='login']")).click();
}
}
