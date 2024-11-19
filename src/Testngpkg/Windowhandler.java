package Testngpkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.google.com");
}
@Test
public void test()
{
String parentwindow=driver.getWindowHandle();
System.out.println("title is "+driver.getTitle());
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.facebook.com");
driver.switchTo().window(parentwindow);
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.ebay.com");
ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(windowdetails.get(1));
System.out.println(driver.getTitle());
}
}
