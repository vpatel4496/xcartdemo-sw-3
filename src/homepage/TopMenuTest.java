package homepage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://mobile.x-cart.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        // Click on "Shipping" link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]/a"));
        // Verify the text "Shipping"
        verifyText("Shipping", By.xpath("//div[@class='list-container']/h1"), "Verify shipping text");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        // Click on "New!"link
        clickOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul[1]/li[4]/a"));
        // verify the text "New arrivals"
        verifyText("New arrivals", By.id("page-title"), "New arrivals");
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() {
        // Click on the "Coming soon" link
        clickOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul[1]/li[5]"));
        verifyText("Coming soon", By.id("page-title"), "Coming soon");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        // Click on "Contact us" link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]/a"));
        // Verify the text "Contact us"
        verifyText("Contact us", By.xpath("//div[@class='list-container']/h1"),"Contact us");





    }
}
