package Testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guruu {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		}
	@Test
	public void test()
	{
	WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(right).perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
	driver.switchTo().alert().accept();
	WebElement click=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(click).perform();
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
		
	}
}
