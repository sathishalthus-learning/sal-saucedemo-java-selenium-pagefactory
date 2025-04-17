package pagefactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
	//
	@Test
	public void init() throws Exception{
		HomePage homePage = new HomePage(driver);
		ProductsPage productsPage = homePage.loginToSauceDemo();
		Assert.assertEquals("Products", productsPage.getHeading());
	}
}
