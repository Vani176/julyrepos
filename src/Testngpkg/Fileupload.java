package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\PC\\Desktop");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		WebElement button =driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		if(button.isDisplayed() ) {
			System.out.println("present");
		}
			else {
				System.out.println("not present");}
			}
	}

