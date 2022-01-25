import org.openqa.selenium.By;

public class Locators {
    // HOME PAGE
    public static final By HOME_PAGE_CREATE = By.xpath("//div[@class = 'css-108j06w']/a[@class = '_button_d2f0c _flat_d2f0c _button_d2f0c _squared_d2f0c _primary_d2f0c join-button']");
    public static final By TEXT_FIELD_FIRST_NAME = By.xpath("//div[@class = 'css-108j06w']/a[@class = '_button_d2f0c _flat_d2f0c _button_d2f0c _squared_d2f0c _primary_d2f0c join-button']");
    public static final By TEXT_FIELD_LAST_NAME = By.xpath("//div[@class = 'css-108j06w']/a[@class = '_button_d2f0c _flat_d2f0c _button_d2f0c _squared_d2f0c _primary_d2f0c join-button']");
    public static final By EMAIL = By.xpath("//div[@class = 'css-108j06w']/a[@class = '_button_d2f0c _flat_d2f0c _button_d2f0c _squared_d2f0c _primary_d2f0c join-button']");
    public static final By PASSWORD = By.xpath("//div[@class = 'css-108j06w']/a[@class = '_button_d2f0c _flat_d2f0c _button_d2f0c _squared_d2f0c _primary_d2f0c join-button']");
    public static final By CONFIRM_PASSWORD = By.xpath("//input[@id = 'confirmPassword']");
    public static final By AGREE = By.xpath("//input[@id = 'hasAgreedTos']");
    public static final By CAPTCHA = By.xpath("//iframe[@title='reCAPTCHA']");
}
