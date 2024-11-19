package Testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		}
	@Test
	public void datepicker()throws Exception
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
	datepickermethod("december 2024","20");
}
	private void datepickermethod(String expmonth,String expdate) {
		while(true) {
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			System.out.println("month="+month);
			if(month.equalsIgnoreCase(expmonth)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
		}
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr//a"));

		for (WebElement d:dates) {
			if(d.getText().equals(expdate)) {
				d.click();
				break;
			}
		}
		
	}
}
