package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
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
	@BeforeMethod
	public void beforeMethod() {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("testCaseLogin");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		
	}

	@Test (priority = 2)
	public void loginNegetive() {
		WebElement userNameText = driver.findElement(By.name("username"));
		userNameText.clear();
		userNameText.sendKeys("12345");

		WebElement passwordText = driver.findElement(By.name("password"));
		passwordText.sendKeys("dhghfsj123");

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();

	}

}
