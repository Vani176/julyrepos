package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fbloginpage;

public class fblogintest {
WebDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test()
{
	Fbloginpage obj=new Fbloginpage(driver);
	obj.setvalues("vaniks23@gmail.com","password");
	obj.login();
}
}
