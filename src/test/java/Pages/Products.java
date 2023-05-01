package Pages;

import org.junit.jupiter.api.ClassOrderer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
    WebDriver driver;

    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement login_click;

    @FindBy(xpath = "//input[@name='email']")
    WebElement login_email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement login_btn;

    @FindBy(xpath = "(//a[contains(.,'Products')])[1]")
    WebElement product;

    @FindBy(xpath = "(//a[contains(.,'view details')])[2]")
    WebElement view_details;

    @FindBy(xpath = "//button[@id='addToCart']")
    WebElement addToCart;

    @FindBy(id = "cartStatus")
    WebElement cart;

    @FindBy(xpath = "//a[contains(.,'Shopping Cart')]")
    WebElement Shopping_Cart;

    @FindBy(xpath = "//button[contains(@class,'btn')]")
    WebElement checkout;

    @FindBy(xpath = "//a[@id='custom-v-pills-payment-tab']")
    WebElement payment_method;

    @FindBy(xpath = "(//li[contains(.,'Cart')])[4]")
    WebElement Testassert;


    public Products(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String ProductsPage(String email, String password) throws InterruptedException {

        login_click.click();
        login_email.sendKeys(email);
        Thread.sleep(1000);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(2000);
        product.click();
        Thread.sleep(1000);
        view_details.click();
        addToCart.click();
        Thread.sleep(5000);
        cart.click();
        Shopping_Cart.click();
        Thread.sleep(5000);
        checkout.click();
        payment_method.click();

        return Testassert.getText();
    }

}
