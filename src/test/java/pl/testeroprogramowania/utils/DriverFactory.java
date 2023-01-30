package pl.testeroprogramowania.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverFactory {

    public static WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        return new ChromeDriver();
    }

}
