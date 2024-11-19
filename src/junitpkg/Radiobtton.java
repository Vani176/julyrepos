package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtton {
	ChromeDriver obj;
	@Before
	public void setup()
	{
		obj=new ChromeDriver();
		obj.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void buttoncheck()
	{
	WebElement radiobutton=	obj.findElement(By.xpath("//input[1][contains(@name,'gender')]"));
		boolean l =radiobutton.isSelected();
		if(l) {
			System.out.println("radio button is enabled ");
		}
		else {
			System.out.println("is not enable");
		}
	}
}
