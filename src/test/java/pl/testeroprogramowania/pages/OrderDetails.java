package pl.testeroprogramowania.pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetails {

    @FindBy(xpath = "//div[@class='woocommerce-order']//p")
    private WebElement orderNotice;

    @FindBy(xpath = "//td[@class='woocommerce-table__product-name product-name']")
    private WebElement productName;

    public OrderDetails(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public WebElement getOrderNotice() {
        return orderNotice;
    }

    public WebElement getProductName() {
        return productName;
    }
}
