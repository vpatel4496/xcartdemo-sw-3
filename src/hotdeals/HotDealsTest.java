package hotdeals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class HotDealsTest extends Utility {

    String baseUrl = "https://mobile.x-cart.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        // Hoover mouse on "Hot deals"link
        mouseHooveringToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // Mouse hoover on "Sale link" and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[1]"));
        // Verify the text "Sale"
        verifyText("Sale", By.id("page-title"), "Verify sale text");
        // Mouse hoover on "Short By" and select name "A-Z"
        mouseHooveringToElement(By.xpath("//div[@class='sort-box']/div"));
        // Verify the product in grid list
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]/a"));
        // Verify the product in alphabetical order
        verifyText("Name A - Z", By.xpath("//span[@class='sort-by-value']"), "Verify product arrange alphabetically");
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        // Hoovering mouse on "Hot deal" link
        mouseHooveringToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[1]"));
        // Verify the text “Sale”
        verifyText("Sale", By.id("page-title"), "Verify sale text");
        // Mouse hover on “Sort By” and select “Price Low-High”
        mouseHooveringToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a"));
        Thread.sleep(2000);
        // Verify that the product’s price from Low to High
        verifyText("Price Low - High", By.xpath("//span[@class='sort-by-value']"), "Verify product price low to high");
    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        // Mouse hover on the “Hot deals” link
        mouseHooveringToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[1]"));
        // Verify the text “Sale”
        verifyText("Sale", By.id("page-title"), "Verify sale text");
        // Mouse hover on “Sort By” and select “Rates”
        mouseHooveringToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/a"));
        Thread.sleep(2000);
        //  Verify that the product’s arrange Rates
        verifyText("Rates", By.xpath("//span[@class='sort-by-value']"), "Verify product arranged in Rates");
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        // Mouse hover on the “Hot deals” link
        mouseHooveringToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        // Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        // Mouse hover on “Sort By” and select “Name Z-A”
        mouseHooveringToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]/a"));
        Thread.sleep(2000);
        // Verify that the product arrange by Z to A
        verifyText("Name Z - A", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Name Z - A");
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        // Mouse hover on the “Hot deals” link
        mouseHooveringToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        // Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        // Mouse hover on “Sort By” and select “Price High-Low”
        mouseHooveringToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a"));
        Thread.sleep(2000);
        // Verify that the product’s price arrange High to Low
        verifyText("Price High - Low", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Price High - Low");
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        // Mouse hover on the “Hot deals” link
        mouseHooveringToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        // Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        // Mouse hover on “Sort By” and select “Rates”
        mouseHooveringToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[6]/a"));
        Thread.sleep(2000);
        // Verify that the product’s arrange Rates
        verifyText("Rates", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Rates ");

    }
    @After
    public void tearDown() {
        closeBrowser();
    }


}





