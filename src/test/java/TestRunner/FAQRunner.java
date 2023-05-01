package TestRunner;

import BaseURL.SetUp;
import Pages.About_Us;
import Pages.FAQ;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FAQRunner extends SetUp {

    FAQ faq;
    Utils utils;

    @Test(priority = 0,description = "Verified FAQ page")
    public void FaqPage() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        faq = new FAQ(driver);
        utils = new Utils(driver);
        utils.getUserCreds(0);
        String nn=faq.FaqPage(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn, "Freequently Asked Questions");
        System.out.println(nn);
    }
}
