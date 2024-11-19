package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {
	ChromeDriver obj;
	@Before
	public void setup()
	{
		obj=new ChromeDriver();
		obj.get("https://www.saucedemo.com");
	}
	@Test
	public void sauce()
	{
		obj.findElement(By.id("user-name")).sendKeys("standard_user");
		obj.findElement(By.id("password")).sendKeys("secret_sauce");
		obj.findElement(By.id("login-button")).click();
		obj.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	    obj.findElement(By.xpath("//div[@id='shopping_cart_container']/a/span")).click();	
	    obj.findElement(By.id("checkout")).click();
	    obj.findElement(By.id("first-name")).sendKeys("anu");
	    obj.findElement(By.name("lastName")).sendKeys("s");
	    obj.findElement(By.id("postal-code")).sendKeys("123");
	    obj.findElement(By.id("continue")).click();
	    obj.findElement(By.id("finish")).click();
	    }
}