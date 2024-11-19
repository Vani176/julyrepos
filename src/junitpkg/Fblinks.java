package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblinks {
ChromeDriver obj;
@Before
public void setup()
{
	obj=new ChromeDriver();
		obj.get("https://www.facebook.com");
		obj.manage().window().maximize();
}
@Test
public void fblogin()
{
	List <WebElement> li=obj.findElements(By.tagName("a"));
	System.out.println("total no of links ="+li.size());
}
}
