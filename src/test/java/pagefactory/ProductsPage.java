package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	//
	WebDriver driver;
	//
	@FindBy(className = "product_label")
	WebElement heading;
	
	// Constructor
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//
	public String getHeading() {
		return heading.getText();
	}
}
