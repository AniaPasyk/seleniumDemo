package pl.testeroprogramowania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class ProductListPage {

    private WebDriver driver;


    public ProductListPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public ProductPage openProduct(String title) {
        By productXpath = By.xpath("//h2[text()='" + title + "']");
        SeleniumHelper.waitForClickAble(productXpath,driver);
        driver.findElement(productXpath).click();
        return new ProductPage(driver);

    }


}
