package tests.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DriverSingleton;
import pages.Page;

import java.time.Duration;


public class BaseTest {
    //declaring the variables webdriver and Page which represents page object

    WebDriver driver;
    Page page;

    @BeforeMethod
    public void warmUp() {
    }

    @AfterMethod
    public void tearDown() {
        DriverSingleton.quit();
    }
}
