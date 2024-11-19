package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {
static String baseurl="https://www.google.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get(baseurl);
String sr=driver.getPageSource();
String exp="About";
if(sr.contains(exp))
{
	System.out.println("contains");
}
else {
	System.out.println("Doesnot contains");
}
	}

}
