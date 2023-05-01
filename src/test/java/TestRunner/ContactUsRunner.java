package TestRunner;

import BaseURL.SetUp;
import Pages.Contact_Us;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ContactUsRunner extends SetUp {
    Contact_Us contact;
    Utils utils;

    @Test(priority = 0,description = "Verified Contact Us page")
    public void ContactUsPage() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        contact = new Contact_Us(driver);
        utils = new Utils(driver);
        utils.getUserCreds(0);
        String nn=contact.ContactUsPage(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn, "Contact Us");
        System.out.println(nn);
    }
}
