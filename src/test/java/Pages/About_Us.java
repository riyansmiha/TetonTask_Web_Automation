package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class About_Us {
    WebDriver driver;

    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement login_click;

    @FindBy(xpath = "//input[@name='email']")
    WebElement login_email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement login_btn;

    @FindBy(xpath = "(//a[contains(.,'About Us')])[1]")
    WebElement about_us;

    @FindBy(xpath = "(//li[contains(.,'About Us')])[3]")
    WebElement Testassert;

    public About_Us(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String AboutPage(String email, String password) throws InterruptedException {

        login_click.click();
        login_email.sendKeys(email);
        Thread.sleep(1000);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(4000);
        about_us.click();
        Thread.sleep(2000);

        return Testassert.getText();
    }
}
