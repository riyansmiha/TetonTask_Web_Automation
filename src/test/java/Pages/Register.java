package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

    WebDriver driver;

    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement login_click;

    @FindBy(xpath = "//a[@href='https://shop.tetonelectronics.com/register']")
    WebElement reg_link;

    @FindBy(xpath = "//input[contains(@id,'name')]")
    WebElement full_name;

    @FindBy(xpath = "//input[@placeholder='Enter email address']")
    WebElement reg_email;

    @FindBy(xpath = "//input[@id='mobile']")
    WebElement phone_no;

    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement register;

   // @FindBy(xpath = "//i[contains(@class,'flaticon-user-profile')]")
   // WebElement profile;

  //  @FindBy(xpath = "(//a[contains(.,'Logout')])[1]")
  //  WebElement logout;

    @FindBy(xpath = "//li[@class='breadcrumb-item active'][contains(.,'Shop')]")
    WebElement Testassert;

    @FindBy(xpath = "//strong[contains(.,'The email has already been taken.')]")
    WebElement Testassert2;



    public Register(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }



//    public String validEmailRegister(String email, String password) throws InterruptedException {
//
//        login_click.click();
//        reg_link.click();
//        Thread.sleep(1000);
//        full_name.sendKeys("Sajib M Riyan");
//        reg_email.sendKeys(email);
//        phone_no.sendKeys("01745273337");
//        pass.sendKeys(password);
//        register.click();
//        Thread.sleep(5000);
//        //profile.click();
//        //Thread.sleep(5000);
//        //logout.click();
//
//        return Testassert.getText();
//    }

    public String alreadyRegisteredEmail(String email, String password) throws InterruptedException {

        login_click.click();
        reg_link.click();
        Thread.sleep(1000);
        full_name.sendKeys("Sajib Miah");
        reg_email.sendKeys(email);
        phone_no.sendKeys("01746273123");
        pass.sendKeys(password);
        Thread.sleep(1000);
        register.click();
        Thread.sleep(5000);

        return Testassert2.getText();
    }


}

