package TestRunner;

import BaseURL.SetUp;
import Pages.Products;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ProductRunner extends SetUp {

    Products prod;
    Utils utils;

    @Test(priority = 0,description = "Order and Product select")
    public void ProductsPage() throws IOException, ParseException, InterruptedException {
        driver.get("https://shop.tetonelectronics.com/");
        prod = new Products(driver);
        utils = new Utils(driver);
        utils.getUserCreds(0);
        String nn=prod.ProductsPage(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn, "Cart");
        System.out.println(nn);
    }
}
