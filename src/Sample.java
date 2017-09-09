import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Sample {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
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
