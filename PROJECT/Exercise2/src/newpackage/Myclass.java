package newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tsepo Matyana\\Downloads\\chromedriver_win32\\chromedriver.win32");



		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");

		//Registration
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).click();
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys("Sipho");
		driver.findElement(By.name("lastName")).click();
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys("Dlamini");
		driver.findElement(By.name("phone")).click();
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("0835886502");
		driver.findElement(By.id("userName")).click();
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("siphodla@gmail.com");
		driver.findElement(By.name("address1")).click();
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys("631c Soweto");
		driver.findElement(By.name("city")).click();
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Johannesburg");
		driver.findElement(By.name("state")).click();
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Gauteng");
		driver.findElement(By.name("postalCode")).click();
		driver.findElement(By.name("postalCode")).clear();
		driver.findElement(By.name("postalCode")).sendKeys("1809");
		driver.findElement(By.name("country")).click();
		// new Select(driver.findElement(By.name("country"))).selectByVisibleText("SOUTH AFRICA");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Page-6'])[1]/following::div[1]")).click();







	}

}

