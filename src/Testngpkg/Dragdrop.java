package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		}
	@Test
	public void test()
	{
		WebElement bdrag=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement bamt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement bdrop=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement sdrag=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
        WebElement sdrop=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        WebElement bamtdrop=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        WebElement samt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement samtdrop=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(bdrag, bdrop).perform();
		act.dragAndDrop(sdrag,sdrop ).perform();
		act.dragAndDrop(bamt, bamtdrop).perform();
		act.dragAndDrop(samt, samtdrop).perform();
	WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	if(button.isDisplayed() ) {
		System.out.println("present");
	}
		else {
			System.out.println("not present");}
		}
	}
	

