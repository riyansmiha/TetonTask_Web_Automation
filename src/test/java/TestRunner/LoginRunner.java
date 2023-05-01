package TestRunner;

import BaseURL.SetUp;
import Pages.Login;
import Pages.Register;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginRunner extends SetUp {
    Login log;
    Utils utils;

    @Test(priority = 0,description = "After giving valid creds,user will be Create Account successfully")
    public void doLoginWithValidCreds() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        log = new Login(driver);
        utils = new Utils(driver);
        utils.getUserCreds(0);
        String nn=log.doLoginWithValidCreds(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn, "OUR PRODUCTS");
        System.out.println(nn);
    }

    @Test(priority = 1,description = "After giving invalid email")
    public void doLoginWithInvalidEmail() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        log = new Login(driver);
        utils = new Utils(driver);
        utils.getUserCreds(1);
        String nn1=log.doLoginWithInvalidEmail(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn1, "This email is not registered");
        System.out.println(nn1);
    }

    @Test(priority = 2,description = "After giving invalid password")
    public void doLoginWithInvalidPass() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        log = new Login(driver);
        utils = new Utils(driver);
        utils.getUserCreds(2);
        String nn2=log.doLoginWithInvalidPass(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn2, "This is wrong password");
        System.out.println(nn2);
    }
}
