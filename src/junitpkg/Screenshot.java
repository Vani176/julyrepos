package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver obj;
	@Before
	public void setup()
	{
		obj=new ChromeDriver();
			obj.get("https://www.facebook.com");
			obj.manage().window().maximize();
	}
	@Test
	public void fblogin() throws Exception
	{
		File s=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("E.//Screenshot1.png"));
		WebElement button=obj.findElement(By.name("login"));
		File s1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s1, new File("./Screenshot/buttonscreenshot.png"));
	}
}
