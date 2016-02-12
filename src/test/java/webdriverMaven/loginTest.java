package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin(){
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("swati.iet@gmail.com");
		//driver.findElement(By.id("Passwd")).sendKeys("123");
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
}
