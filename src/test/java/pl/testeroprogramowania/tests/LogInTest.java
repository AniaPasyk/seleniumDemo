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
                .logInValidData("test8@titi.pl", "tete7tet!@#45")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

}
