import org.testng.annotations.Test;

public class HomePageTest extends Create {

    @Test
    public void createAccount() {
        homePage.clickOnCreateAccount();
        homePage.waitForPageLoad();
        homePage.checkURL();
        homePage.fillOutTheForm();
        homePage.clickAgree();
        homePage.clickCaptcha();
    }
}
