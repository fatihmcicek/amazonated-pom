package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.Base.BasePage;

import java.util.logging.Logger;

public class LoginPage extends BasePage {

    private final By NAV_LOGIN_BUTTON = By.id("nav-link-accountList-nav-line-1");
    private final By SEND_TEXT_EMAIL = By.id("ap_email");
    private final By CLICK_CONTINUE = By.id("continue");
    private final By SEND_TEXT_PASSWORD = By.id("ap_password");
    private final By SIGN_IN_SUBMIT = By.id("signInSubmit");

    Logger logger = Logger.getLogger(HomePage.class.getName());


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        wait.until(ExpectedConditions.elementToBeClickable(NAV_LOGIN_BUTTON)).click();
        logger.info("--> Amazon Giriş Yap sayfasında");

        wait.until(ExpectedConditions.elementToBeClickable(SEND_TEXT_EMAIL)).sendKeys("fatihmcicek5@gmail.com");
        logger.info("--> Mail adresi yazıldı");
        wait.until(ExpectedConditions.elementToBeClickable(CLICK_CONTINUE)).click();

        wait.until(ExpectedConditions.elementToBeClickable(SEND_TEXT_PASSWORD)).sendKeys("Notest2022!");
        logger.info("--> Şifre girildi");

        wait.until(ExpectedConditions.elementToBeClickable(SIGN_IN_SUBMIT)).click();
        logger.info("--> Giriş yapıldı");
    }

}
