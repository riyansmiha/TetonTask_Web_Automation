package TestRunner;

import BaseURL.SetUp;
import Pages.Register;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterRunner extends SetUp {

    Register reg;
    Utils utils;

//    @Test(priority = 0,description = "After giving valid email,user will be Create Account successfully")
//    public void validEmailRegister() throws IOException, ParseException, InterruptedException {
//        driver.get("https://shop.tetonelectronics.com/");
//        reg = new Register(driver);
//        utils = new Utils(driver);
//        utils.getUserCreds(0);
//        String nn=reg.validEmailRegister(utils.getEmail(), utils.getPassword());
//        Assert.assertEquals(nn, "Shop");
//        System.out.println(nn);
//    }

    @Test(priority = 0,description = "Cannot Create Account with already registered email")
    public void alreadyRegisteredEmail() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        reg = new Register(driver);
        utils = new Utils(driver);
        utils.getUserCreds(0);
        String nn1=reg.alreadyRegisteredEmail(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn1, "The email has already been taken.");
        System.out.println(nn1);
    }

}

