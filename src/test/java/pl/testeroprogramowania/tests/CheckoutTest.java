package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.models.Customer;
import pl.testeroprogramowania.pages.HomePage;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {

        Customer customer = new Customer();
        customer.setFirstName("Ania");
        customer.setLastName("Tester");
        customer.setCompanyName("abc");
        customer.setCountryName("Poland");
        customer.setStreetAddress("Testowa 45");
        customer.setPostCode("1111");
        customer.setCity("Warsaw");
        customer.setPhoneNumber("4545454545");
        customer.setEmail("rando@random.com");

        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart().openAddresDetails()
                .fillAddressDetails(customer,"Simple comments");


    }



}
