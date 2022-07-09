package pom.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.driver = driver;
    }

    public void loadPage(String endPoint) {
        driver.get("https://amazon.com.tr/" + endPoint);
    }
}
