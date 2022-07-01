package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pom.Base.BasePage;

public class HomePage extends BasePage {

    private final By cookieLocator = By.id("sp-cc-accept");
    private final By navSearchField = By.id("twotabsearchtextbox");
    private final By navSearchSubmitButton = By.id("nav-search-submit-button");
    private final By navLoginButton = By.id("nav-link-accountList-nav-line-1");
    private final By sendTextEmail = By.id("ap_email");
    private final By clickContinue = By.id("continue");
    private final By sendTextPassword = By.id("ap_password");
    private final By signInSubmit = By.id("signInSubmit");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //--- Load Page
    public HomePage loadPage() {
        loadPage("/");
        return this;
    }

    //--- Accept Cookies
    public HomePage acceptCookies(){
        wait.until(ExpectedConditions.elementToBeClickable(cookieLocator)).click();
        return this;
    }

    //--- Login Section
    public HomePage login(){
        wait.until(ExpectedConditions.elementToBeClickable(navLoginButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sendTextEmail)).sendKeys("fatihmcicek5@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(clickContinue)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sendTextPassword)).sendKeys("Notest2022!");
        wait.until(ExpectedConditions.elementToBeClickable(signInSubmit)).click();
        return this;
    }

    public HomePage textingSearchBox(String txt){
        wait.until(ExpectedConditions.elementToBeClickable(navSearchField)).sendKeys(txt);
        return this;
    }

    public HomePage clickSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(navSearchSubmitButton)).click();
        return this;
    }

    public HomePage isOnHomePage(){
        String e = driver.getTitle();
        Assert.assertEquals(e,"Amazon.com.tr : macbook");
        return this;
    }

}
