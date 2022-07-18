package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.Base.BasePage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ShoppingCart extends BasePage {

    private final By DELETE_PRODUCT = By.cssSelector("input[value='Sil']");
    private final By BACK_TO_HOMEPAGE = By.xpath("//*[@id='nav-logo']");

    Logger logger = LogManager.getLogger(ShoppingCart.class);

    public ShoppingCart(WebDriver driver) {
        super(driver);
    }


    public ShoppingCart deleteProduct(){
        logger.info("--> Ürün Siliniyor");
        wait.until(ExpectedConditions.elementToBeClickable(DELETE_PRODUCT)).click();
        logger.info("--> Ürün Siliniyor");
        return this;
    }

    public ShoppingCart backToHomePage(){
        logger.info("--> Ana Sayfaya Dönülüyor");
        wait.until(ExpectedConditions.elementToBeClickable(BACK_TO_HOMEPAGE)).click();
        return this;
    }


}
