package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffdate {
	ChromeDriver obj;
	@Before
	public void setup()
	{
		obj=new ChromeDriver();
		obj.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void dob()
	{
		WebElement day=obj.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select ob=new Select(day);
		ob.selectByValue("02");
	    WebElement month=obj.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
     	Select b=new Select(month);
    	b.selectByValue("03");
	    WebElement year=obj.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	    Select s=new Select(year);
    	s.selectByValue("2003");
	}
	@Test
	public void text() {
	    WebElement button = obj.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
	    String text = button.getAttribute("value");

	    if (text.equals("Check availability")) {
	        System.out.println("pass");
	    } else {
	        System.out.println("fail");
	    }
	}

	}
