package Testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
@BeforeTest(alwaysRun=true)
public void setup()
{
System.out.println("beforetest,browser open");	
}
@BeforeMethod(alwaysRun=true)
public void mthd()
{
	System.out.println("url loading");
}
@Test(priority=4,groups= {"sanity"})
public void test1()
{
	System.out.println("test1");
}
@Test(priority=2,groups= {"smoke","sanity"})
public void test2()
{
	System.out.println("test2");
}
@Test(priority=1,enabled=false,groups= {"regression"})
public void test3()
{
	System.out.println("test3");
}
@Test(priority=3,groups= {"regression"})
public void test4()
{
	System.out.println("test4");
}
@AfterMethod
public void m()
{
	System.out.println("after method");
}
@AfterTest
public void aftest()
{
	System.out.println("after test");
}
}
