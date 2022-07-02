import org.testng.annotations.Test;
import pom.Base.BaseTest;
import pom.Pages.HomePage;

public class TestClass extends BaseTest {

    @Test
    public void guestCheckOut() {

        HomePage homePage = new HomePage(driver);
        homePage.
                loadPage().
                isOnHomePage().
                acceptCookies().
                login().
                textingSearchBox("macbook").
                clickSearchButton();
    }
}
