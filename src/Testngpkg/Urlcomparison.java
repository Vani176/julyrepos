package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Urlcomparison {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun=true)
	public void bformths()
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("ponnu3498@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass)\"]")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();	
		String eurl="https://keralaproperty.in/member/myhome/";
		Thread.sleep(3000);
		String aurl=driver.getCurrentUrl();
		if(eurl.equalsIgnoreCase(aurl))
		{
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
		
	}
}