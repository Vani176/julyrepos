package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/PC/Documents/alert.html");
		driver.manage().window();
	}
	@Test
	public void html()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println("alert messageis "+s);
		a.accept();
        driver.findElement(By.name("firstname")).sendKeys("abc");
        driver.findElement(By.name("lastname")).sendKeys("s");
	}
}
	
