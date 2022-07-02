package pom.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.Factory.DriverManager;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void initializeDriver(){
        driver = new DriverManager().initializeDriver();
    }

    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
}
