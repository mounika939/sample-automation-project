package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends  BaseTest {

	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("tomsmith");
		loginPage.enterPassword("SuperSecretPassword!");
		loginPage.clickLogin();

		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getHeaderText().contains("Secure Area"), "Login Failed!");
	}
}
