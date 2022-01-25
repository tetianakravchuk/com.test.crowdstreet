import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseAction {
    public WebDriver driver;
    public WebDriverWait wait;

    public BaseAction(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void waitForPageLoad() {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        if (j.executeScript("return document.readyState").toString().equals("complete")) {
            System.out.println("Page has loaded");
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(Locators.TEXT_FIELD_FIRST_NAME));
    }

}
