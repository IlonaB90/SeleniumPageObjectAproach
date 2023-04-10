import org.junit.Assert;
import org.junit.Test;

public class ShopTest extends BaseTest {

    private final static String BASE_URL = "https://demo.opencart.com/";

    @Test
    public void Test() {
        HomePage homePage = new HomePage(BASE_URL);
        ShoppingCartEmptyPage shoppingCartEmptyPage = new ShoppingCartEmptyPage();

        Assert.assertTrue(homePage.findAndClickOnShopCart());
        Assert.assertTrue(shoppingCartEmptyPage.checkPageIsEmpty());
        Assert.assertTrue(shoppingCartEmptyPage.findAndClickOnContinueButton());
        Assert.assertTrue(homePage.checkIfPageIsLoaded());

    }
}
