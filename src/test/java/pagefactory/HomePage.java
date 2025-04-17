package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//
	WebDriver driver;
	
	//
	@FindBy(id = "user-name")
	WebElement userNameBox;
	
	@FindBy(id="password")
	WebElement passWordBox;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//
	public ProductsPage loginToSauceDemo() {
		userNameBox.sendKeys("standard_user");
		passWordBox.sendKeys("secret_sauce");
		loginButton.click();
		return new ProductsPage(driver);
	}
}
