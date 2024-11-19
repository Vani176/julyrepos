package Testngpkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class testngprbs {
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
	System.out.println("beforetest,browser open");	
	}
	@BeforeMethod(alwaysRun=true)
	public void mthd()
	{
		System.out.println("https://www.google.com");
	}
	
}
