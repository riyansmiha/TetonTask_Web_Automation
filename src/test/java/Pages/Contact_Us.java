package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Us {
    WebDriver driver;

    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement login_click;

    @FindBy(xpath = "//input[@name='email']")
    WebElement login_email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement login_btn;

    @FindBy(xpath = "(//a[contains(.,'Contact Us')])[1]")
    WebElement contact;

    @FindBy(xpath = "(//li[contains(.,'Contact Us')])[3]")
    WebElement Testassert;

    public Contact_Us(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String ContactUsPage(String email, String password) throws InterruptedException {

        login_click.click();
        login_email.sendKeys(email);
        Thread.sleep(1000);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(4000);
        contact.click();
        Thread.sleep(2000);

        return Testassert.getText();
    }
}
