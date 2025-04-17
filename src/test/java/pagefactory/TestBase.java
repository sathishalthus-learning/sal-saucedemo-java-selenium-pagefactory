package pagefactory;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void initilizeBrowser() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
