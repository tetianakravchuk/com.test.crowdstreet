import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePageTest extends Create {
    String homeURL = "";
    String createAccountURL = "https://test.crowdstreet.com/invexp/accounts/create-account";

    @Test
    public void createAccount() {
        WebElement elementAccount = driver.findElement(By.xpath("//div[@class = 'css-108j06w']/a[@class = '_button_d2f0c _flat_d2f0c _button_d2f0c _squared_d2f0c _primary_d2f0c join-button']"));
        Actions action = new Actions(driver);
        action.moveToElement(elementAccount).click().perform();
        JavascriptExecutor j = (JavascriptExecutor) driver;
        if (j.executeScript("return document.readyState").toString().equals("complete")) {
            System.out.println("Page has loaded");
        }
        String URL = driver.getCurrentUrl();
        if (!URL.equals(createAccountURL)) {
            driver.navigate().refresh();
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id = 'firstName']")));
        driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Test@mailinator.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//input[@id = 'confirmPassword']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//input[@id = 'hasAgreedTos']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
    }
}
