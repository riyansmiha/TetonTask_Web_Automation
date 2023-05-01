package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement login_click;

    @FindBy(xpath = "//input[@name='email']")
    WebElement login_email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement login_btn;

    @FindBy(xpath = "//i[contains(@class,'flaticon-user-profile')]")
    WebElement profile;

    @FindBy(xpath = "(//a[contains(.,'Logout')])[1]")
    WebElement logout;

    @FindBy(xpath = "//h2[contains(.,'OUR PRODUCTS')]")
    WebElement Testassert;

    @FindBy(xpath = "//strong[contains(.,'This email is not registered')]")
    WebElement Testassert2;

    @FindBy(xpath = "//strong[contains(.,'This is wrong password')]")
    WebElement Testassert3;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String doLoginWithValidCreds(String email, String password) throws InterruptedException {

        login_click.click();
        login_email.sendKeys(email);
        Thread.sleep(1000);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(9000);
        profile.click();
        Thread.sleep(4000);
        logout.click();
        Thread.sleep(1000);

        return Testassert.getText();
    }

    public String doLoginWithInvalidEmail(String email, String password) throws InterruptedException {

        login_click.click();
        login_email.sendKeys(email);
        Thread.sleep(1000);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(2000);

        return Testassert2.getText();
    }

    public String doLoginWithInvalidPass(String email, String password) throws InterruptedException {

        login_click.click();
        login_email.sendKeys(email);
        Thread.sleep(1000);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(2000);

        return Testassert3.getText();
    }
}
