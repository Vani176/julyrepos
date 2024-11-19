package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkvalidation {
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
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
					 verify(link);
		}
	}
	private void verify(String link) {
		

	try
	{
		URI obj= new URI(link);
	HttpURLConnection con=	(HttpURLConnection)obj.toURL().openConnection();
	if(con.getResponseCode()==200)
	{
		System.out.println("success response code is "+link);
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println("broken link responde code is" +link);
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
}
}