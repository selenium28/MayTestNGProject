package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class LoginDashboard {
	WebDriver driver;

	@Test (priority = 1)
	public void loginTest() {
		
		WebElement userNameText = driver.findElement(By.name("username"));
		userNameText.clear();
		userNameText.sendKeys("Admin");
		
		WebElement passwordText = driver.findElement(By.name("password"));
		passwordText.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();
		

	}
	@BeforeTest
	public void beforeMethod() {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("testCaseLogin");
	}

	@AfterTest
	public void afterMethod() {
		driver.quit();
		
	}

	@Test (priority = 2)
	public void dashBoard() {
		
		driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();

	}
	
	@Test (priority = 3)
	public void payMent() {
		
		System.out.println("Payment Method");

	}

}
