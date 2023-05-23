package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNormalClass {

	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/test/delete_customer.php";

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
