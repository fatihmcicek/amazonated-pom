package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.Base.BasePage;

import java.util.logging.Logger;

public class ProductPage extends BasePage {

    private final By CLICK_PRODUCT = By.xpath("//*[@cel_widget_id=\"MAIN-SEARCH_RESULTS-6\"]");
    private final By IS_STOCKED = By.xpath("//*[@class='a-size-medium a-color-success']");
    private final By ADD_TO_CART = By.xpath("//*[@id='add-to-cart-button']");
    private final By GO_TO_SHOPPING_CART = By.xpath("//*[@class=' nav-progressive-attribute']");


    Logger logger = Logger.getLogger(HomePage.class.getName());

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage addProduct() {
        logger.info("--> Ürüne Tıklanıyor");
        wait.until(ExpectedConditions.elementToBeClickable(CLICK_PRODUCT)).click();
        logger.info("--> Ürüne Tıklandı");
        return this;
    }

    public ProductPage isStocked() {
        logger.info("--> Stok Kontrolü Yapılıyor");
        String e = driver.findElement(IS_STOCKED).getText();
        logger.info(e);

        System.out.println(e);
        //Assert.assertEquals(e, "Stokta var.");
        return this;
    }

    public ProductPage addToCart() {
        logger.info("--> Urun Sepete Ekleniyor");
        wait.until(ExpectedConditions.elementToBeClickable(ADD_TO_CART)).click();
        logger.info("--> Urun Sepete Eklendi");
        return this;
    }

    public ProductPage goToShoppingCart() {
        logger.info("--> Alışveriş Sepetine Gidiliyor");
        wait.until(ExpectedConditions.elementToBeClickable(GO_TO_SHOPPING_CART)).click();
        logger.info("--> Alışveriş Sepetine Gidildi.");
        return this;
    }
}
