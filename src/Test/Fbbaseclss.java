package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Fbbaseclss {
WebDriver driver;
@BeforeClass
public void url()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
}
}
