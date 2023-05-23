package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTestNG {
	
	WebDriver driver;
	
	@Test
	public void testCaseLogin() {
//		String url = "https://demo.guru99.com/test/delete_customer.php";
//
//		driver = new ChromeDriver();
//		driver.get(url);
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("testCaseLogin");
		
	}
	
	@Test
	public void testCaseDashboard() {
		System.out.println("testCaseDashboard");
		
//		driver.findElement(By.id("Dashboard"));
	}
	
	@Test
	public void testCasePay() {
		System.out.println("testCasePay");
	}

}
