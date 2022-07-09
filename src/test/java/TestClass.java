import org.testng.annotations.Test;
import pom.Base.BaseTest;
import pom.Pages.HomePage;
import pom.Pages.LoginPage;
import pom.Pages.ProductPage;
import pom.Pages.ShoppingCart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass extends BaseTest {

    public static String dataCsvFile;

    @Test
    public void guestCheckOut() throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/test/resources/CsvFile.csv"));
        dataCsvFile = sc.nextLine();

        HomePage homePage = new HomePage(driver);
        homePage.
                loadPage().
                isOnHomePage().
                acceptCookies();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        homePage.
                textingSearchBox(dataCsvFile).
                clickSearchButton();
        ProductPage productPage = new ProductPage(driver);
        productPage.
                addProduct().
                isStocked().
                addToCart().
                goToShoppingCart();
        ShoppingCart shoppingCart = new ShoppingCart(driver);
        shoppingCart.
                deleteProduct().
                backToHomePage();
    }
}
