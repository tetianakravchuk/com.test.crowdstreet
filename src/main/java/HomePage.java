import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseAction {

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickOnCreateAccount() {
        WebElement elementAccount = driver.findElement(Locators.HOME_PAGE_CREATE);
        Actions action = new Actions(driver);
        action.moveToElement(elementAccount).click().perform();
    }

    public void checkURL() {
        String URL = driver.getCurrentUrl();
        if (!URL.equals(Data.createAccountURL)) {
            driver.navigate().refresh();
        }
    }

    public void fillOutTheForm() {
        driver.findElement(Locators.TEXT_FIELD_FIRST_NAME).sendKeys(Data.firstName);
        driver.findElement(Locators.TEXT_FIELD_LAST_NAME).sendKeys(Data.lastName);
        driver.findElement(Locators.EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.CONFIRM_PASSWORD).sendKeys(Data.confirmPassword);
    }

    public void clickAgree() {
        driver.findElement(Locators.AGREE).click();
    }

    public void clickCaptcha() {
        driver.switchTo().frame(driver.findElement(Locators.CAPTCHA));
    }
}

