package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random() * 1000);

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidData("test" + random + "@titi.pl", "tete7tet!@#45")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void registerUserWithTheSameEmailTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .registerUserInvalidData("test99@titi.pl", "tete7tet!@#45")
                .getError();

        Assert.assertTrue(error.getText().contains("An account is already registered with your email address"));
    }

}
