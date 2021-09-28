package newpackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Myclass {

	public static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",C:\Users\Tsepo Matyana\Downloads\selenium-chrome-driver-2.26.0.jar.zip\\selenium-chrome-driver-2.26.0");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/newtours/");
	    
                     //registration
	    driver.findElement(By.linkText("REGISTER")).click();
	    driver.findElement(By.name("firstName")).click();
	    driver.findElement(By.name("firstName")).clear();
	    driver.findElement(By.name("firstName")).sendKeys("Tsepo");
	    driver.findElement(By.name("lastName")).click();
	    driver.findElement(By.name("lastName")).clear();
	    driver.findElement(By.name("lastName")).sendKeys("Matyana");
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).clear();
	    driver.findElement(By.name("phone")).sendKeys("0725542170");
	    driver.findElement(By.id("userName")).click();
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("tsepomatyana@gmail.com");
	    driver.findElement(By.name("address1")).click();
	    driver.findElement(By.name("address1")).clear();
	    driver.findElement(By.name("address1")).sendKeys("Ibisi 98693");
	    driver.findElement(By.name("city")).click();
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("Johaneesburg");
	    driver.findElement(By.name("state")).click();
	    driver.findElement(By.name("state")).click();
	    driver.findElement(By.name("state")).clear();
	    driver.findElement(By.name("state")).sendKeys("Gauteng");
	    driver.findElement(By.name("postalCode")).click();
	    driver.findElement(By.name("postalCode")).clear();
	    driver.findElement(By.name("postalCode")).sendKeys("4000");
	    driver.findElement(By.name("country")).click();
	    new Select(driver.findElement(By.name("country"))).selectByVisibleText("SOUTH AFRICA");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("tsepomatyana@gmail.com");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Tn55463!");
	    driver.findElement(By.name("confirmPassword")).click();
	    driver.findElement(By.name("confirmPassword")).clear();
	    driver.findElement(By.name("confirmPassword")).sendKeys("Tn55463!");
	    driver.findElement(By.name("submit")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flash Movie Demo'])[1]/preceding::div[6]")).click();
	
	    //sign in
	    driver.findElement(By.linkText("SIGN-ON")).click();
	    driver.findElement(By.name("userName")).click();
	    driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys("tsepomatyana@gmail.com");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Tn55463!");
	    driver.findElement(By.name("submit")).click();
	    
	    //sign off
	    driver.findElement(By.linkText("SIGN-OFF")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Page-6'])[1]/following::div[1]")).click();
	    
	
	
		
		 

	}

}
