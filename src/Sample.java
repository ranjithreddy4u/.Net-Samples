import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.BrowserVersion;


public class Sample {

	
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://192.168.60.41:8080/qaenv");
		String exptext="Hello, World!";
		String acttext=driver.findElement(By.xpath("html/body")).getText();
		System.out.println("Expected text : "+exptext);
		System.out.println("Actual text : "+acttext);
		
		if(exptext.equals(acttext))
			System.out.println("Passed");
		else
			System.out.println("Failed");
		//Assert.assertEquals("5","6");
		driver.close();
		driver.quit();
		}

}
