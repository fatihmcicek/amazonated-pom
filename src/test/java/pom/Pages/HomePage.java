package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pom.Base.BasePage;

import java.util.logging.Logger;

public class HomePage extends BasePage {
    private final By COOKIE_LOCATOR = By.id("sp-cc-accept");
    private final By NAV_SEARCH_FIELD = By.id("twotabsearchtextbox");
    private final By NAV_SEARCH_SUBMIT_BUTTON = By.id("nav-search-submit-button");

    Logger logger = Logger.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage loadPage() {
        logger.info("--> Page loading");
        loadPage("/");
        logger.info("--> Page loaded");
        return this;
    }

    public HomePage isOnHomePage() {
        String e = driver.getTitle();
        Assert.assertEquals(e, "Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi");
        logger.info(e + "--> on the HomePage");
        return this;
    }

    public HomePage acceptCookies() {
        logger.info("--> Cookies accepting");
        wait.until(ExpectedConditions.elementToBeClickable(COOKIE_LOCATOR)).click();
        logger.info("--> Cookies accepted");
        return this;
    }

    public HomePage textingSearchBox(String item) {
        wait.until(ExpectedConditions.elementToBeClickable(NAV_SEARCH_FIELD)).sendKeys(item);
        logger.info("--> Arama inputuna macbook yazılıyor");
        return this;
    }

    public HomePage clickSearchButton() {
        logger.info("--> Search butonuna tıklanıyor");
        wait.until(ExpectedConditions.elementToBeClickable(NAV_SEARCH_SUBMIT_BUTTON)).click();
        return this;
    }
}
