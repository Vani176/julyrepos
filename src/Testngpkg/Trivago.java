package Testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com.tr/");
		}
	@Test
	public void datepicker()throws Exception
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[3]/div/div/button[2]/span/span[1]")).click();
	datepickermethod("december 2024","20");
	}
		private void datepickermethod(String expmonth,String expdate) {
			while(true) {
				String month=driver.findElement(By.xpath("")).getText();
				System.out.println("month="+month);
				if(month.equalsIgnoreCase(expmonth)) {
					break;
				}
				else {
					driver.findElement(By.xpath("")).click();
				}
			}
			List<WebElement> dates = driver.findElements(By.xpath(""));

			for (WebElement d:dates) {
				if(d.getText().equals(expdate)) {
					d.click();
					break;
				}
			}
}
}
