package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
ChromeDriver obj;
@Before
public void setup()
{
	obj=new ChromeDriver();
	obj.get("https://www.google.com");
}
@Test
public void titleverification()
{
	String act=obj.getTitle();
	String exp="Google";
	if(act.equals(exp))
	{
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}
@After
public void tearDown()
{
	obj.quit();
}
}
