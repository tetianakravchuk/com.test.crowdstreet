import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Create {
    WebDriver driver;
    WebDriverWait wait;
    String homeUrl = "https://test.crowdstreet.com/invexp/properties/all";
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/tetianakravchuk/IdeaProjects/com.test.crowdstreet/chromedriver");
        driver = new ChromeDriver();
        driver.get(homeUrl);
        driver.get("chrome://settings/clearBrowserData");
        driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
        driver.manage().window().maximize();
        driver.get(homeUrl);
        wait = new WebDriverWait(driver, 20);
        homePage = new HomePage(driver, wait);


    }

    @AfterMethod
    public void afterAction() {
        driver.close();
        driver.quit();
    }
}
