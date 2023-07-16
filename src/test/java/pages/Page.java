package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {
    private WebDriver driver;
    private String baseUrl = "https://pudra.by";
    private String loginLinkLocator = "//a[@class='login']";
    private String emailFieldLocator = "emailSign";
    private String passwordFieldLocator = "passwordSign";
    private String enterButtonLocator = "//form[@id='formSign']//button[@type='submit']";
    private String errorMessageLocator = "//div[@class='form-group form-group-error']/label[@class='error' and @style='display: block;']";
    public String errorMessage = "Неверно указан E-mail или пароль";

    public Page getUrl() {
        driver.get(baseUrl);
        return this;
    }

    public Page clickLoginLink() {
        WebElement loginLink = driver.findElement(By.xpath(loginLinkLocator));
        loginLink.click();
        return this;
    }

    public Page keyEmail(String email) {
        WebElement emailField = driver.findElement(By.name(emailFieldLocator));
        emailField.sendKeys(email);
        return this;
    }

    public Page keyPassword(String password) {
        WebElement emailField = driver.findElement(By.name(passwordFieldLocator));
        emailField.sendKeys(password);
        return this;
    }

    public Page clickEnterButton() {
        WebElement enterButton = driver.findElement(By.xpath(enterButtonLocator));
        enterButton.click();
        return this;
    }

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(errorMessageLocator)));
        String errorMessageText = errorMessage.getText();
        return errorMessageText;
    }

    public Page() {
        this.driver = DriverSingleton.getDriver();
    }
}
