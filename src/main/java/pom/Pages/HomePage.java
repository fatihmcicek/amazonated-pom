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
    private final By NAV_LOGIN_BUTTON = By.id("nav-link-accountList-nav-line-1");
    private final By SEND_TEXT_EMAIL = By.id("ap_email");
    private final By CLICK_CONTINUE = By.id("continue");
    private final By SEND_TEXT_PASSWORD = By.id("ap_password");
    private final By SIGN_IN_SUBMIT = By.id("signInSubmit");

    Logger logger = Logger.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage loadPage()  {
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

    public HomePage login() {
        wait.until(ExpectedConditions.elementToBeClickable(NAV_LOGIN_BUTTON)).click();
        logger.info("--> Amazon Giriş Yap sayfasında");

        wait.until(ExpectedConditions.elementToBeClickable(SEND_TEXT_EMAIL)).sendKeys("fatihmcicek5@gmail.com");
        logger.info("--> Mail adresi yazıldı");
        wait.until(ExpectedConditions.elementToBeClickable(CLICK_CONTINUE)).click();

        wait.until(ExpectedConditions.elementToBeClickable(SEND_TEXT_PASSWORD)).sendKeys("Notest2022!");
        logger.info("--> Şifre girildi");

        wait.until(ExpectedConditions.elementToBeClickable(SIGN_IN_SUBMIT)).click();
        logger.info("--> Giriş yapıldı");
        return this;
    }

    public HomePage textingSearchBox(String txt) {
        logger.info("--> Arama inputuna macbook yazılıyor");
        wait.until(ExpectedConditions.elementToBeClickable(NAV_SEARCH_FIELD)).sendKeys(txt);
        return this;
    }

    public HomePage clickSearchButton() {
        logger.info("--> Search butonuna tıklanıyor");
        wait.until(ExpectedConditions.elementToBeClickable(NAV_SEARCH_SUBMIT_BUTTON)).click();
        return this;
    }



}
