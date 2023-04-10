import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private final SelenideElement shopCart = $x("//span[text()='Shopping Cart']");

    private final SelenideElement searchDiv = $x("//div[@id='search']");

    public HomePage(String url) {
        Selenide.open(url);
    }

    public Boolean findAndClickOnShopCart() {
        if (shopCart.exists()) {
            shopCart.click();
            return true;
        }
        return false;
    }

    public Boolean checkIfPageIsLoaded() {
        return searchDiv.exists();
    }

}
