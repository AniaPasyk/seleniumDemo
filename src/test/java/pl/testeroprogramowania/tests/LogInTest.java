package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LogInTest extends BaseTest {

    @Test
    public void loginTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test99@titi.pl", "tete7tet!@#45")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("test99@titi.pl", "blednehaslo")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password"), "Expected error text doesn't match");
    }

}
