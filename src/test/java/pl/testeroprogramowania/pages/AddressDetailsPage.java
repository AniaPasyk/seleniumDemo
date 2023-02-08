package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pl.testeroprogramowania.models.Customer;

public class AddressDetailsPage {

    @FindBy(id = "billing_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "billing_company")
    private WebElement companyInput;

    @FindBy(id = "billing_country")
    private WebElement billingCountrySelect;

    @FindBy(id = "billing_address_1")
    private WebElement streetAddressInput;

    @FindBy(id = "billing_postcode")
    private WebElement postCodeInput;

    @FindBy(id = "billing_city")
    private WebElement cityInput;

    @FindBy(id = "billing_phone")
    private WebElement phoneInput;

    @FindBy(id = "billing_email")
    private WebElement emailInput;

    @FindBy(id = "order_comments")
    private WebElement orderCommentsInputs;

    @FindBy(id = "place_order")
    private WebElement placeOrderButton;

    private WebDriver driver;

    public AddressDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public OrderDetails fillAddressDetails(Customer customer, String comments) {
        firstNameInput.sendKeys(customer.getFirstName());
        lastNameInput.sendKeys(customer.getLastName());
        companyInput.sendKeys(customer.getCompanyName());
        Select countrySelect = new Select(billingCountrySelect);
        countrySelect.selectByVisibleText(customer.getCountryName());
        streetAddressInput.sendKeys(String.format(customer.getStreetAddress()));
        postCodeInput.sendKeys(customer.getPostCode());
        cityInput.sendKeys(customer.getCity());
        phoneInput.sendKeys(customer.getPhoneNumber());
        emailInput.sendKeys(customer.getEmail());
        orderCommentsInputs.sendKeys(comments);
        placeOrderButton.click();

        return new OrderDetails(driver);
    }
}
