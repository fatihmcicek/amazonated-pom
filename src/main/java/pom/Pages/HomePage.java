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

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage loadPage() {
        loadPage("/");
        return this;
    }

    public HomePage acceptCookies(){
        wait.until(ExpectedConditions.elementToBeClickable(cookieLocator)).click();
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
