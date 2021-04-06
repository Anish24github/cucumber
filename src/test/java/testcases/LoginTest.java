package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	
	@Test
	
	public void login() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.google.com/");
		 
		 
		String ActualTitle = driver.getTitle();
		 String ExpectedTitle = "Google";
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
}
