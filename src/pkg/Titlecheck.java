package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver ob=new ChromeDriver();
ob.get("https://www.learnpick.in");
String sr=ob.getTitle();
String exp="Find Private Tutors,Coaching Classes Near You";
if(sr.equals(exp))
{
	System.out.println("Same");
}
else{
	System.out.println(" not Same");
}
	}

}
