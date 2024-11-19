package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver obj=new ChromeDriver();
obj.get("https://www.google.com");
String actualtitle=obj.getTitle();
String exp="Google";
if(actualtitle.equals(exp))
		{
	System.out.println("Same");
		}
else {
	System.out.println("Not same");}
obj.quit();
	}

}
