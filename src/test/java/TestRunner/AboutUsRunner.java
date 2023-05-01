package TestRunner;

import BaseURL.SetUp;
import Pages.About_Us;
import Pages.Login;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AboutUsRunner extends SetUp {
    About_Us abt;
    Utils utils;

    @Test(priority = 0,description = "Verified About us page")
    public void AboutPage() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        abt = new About_Us(driver);
        utils = new Utils(driver);
        utils.getUserCreds(0);
        String nn=abt.AboutPage(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn, "About Us");
        System.out.println(nn);
    }

}
