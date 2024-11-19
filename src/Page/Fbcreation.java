package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreation {
WebDriver driver;
@FindBy(xpath="//*[@id=\"headerInnerContainer\"]/div[1]")
WebElement fbcreationtext;
@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
WebElement Signupbutton;
public Fbcreation(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void check() {
	String text=fbcreationtext.getText();
	String etext="create a page";
	if(text.equalsIgnoreCase(etext))
	{
		System.out.println("displayed");
	}
	else {
		System.out.println("not displayed");
	}
}
public void click()
{
	Signupbutton.click();
}
}