package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class CartPage {

    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToCheckoutButton;

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

          }

    public AddressDetailsPage openAddresDetails() {
        SeleniumHelper.waitForClickAble(proceedToCheckoutButton,driver);
        proceedToCheckoutButton.click();
        return new AddressDetailsPage(driver);
    }





}
