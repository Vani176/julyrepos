package Test;

import org.testng.annotations.Test;

import Page.Fbcreation;

public class Fbcreatepagetest extends Fbbaseclss {
@Test
public void test()
{
	Fbcreation ob=new Fbcreation(driver);
	ob.check();
	ob.click();
}
}
