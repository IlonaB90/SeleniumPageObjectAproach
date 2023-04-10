import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartEmptyPage {

    private final SelenideElement shopCartLabel = $x("//h1[text()='Shopping Cart']");
    private final SelenideElement shopCartEmptyLabel = $x("//p[text()='Your shopping cart is empty!']");

    private final SelenideElement continueButton = $x("//a[text()='Continue']");

    public boolean checkPageIsEmpty() {
        return shopCartLabel.exists() && shopCartEmptyLabel.exists();
    }

    public boolean findAndClickOnContinueButton() {
        if (continueButton.exists()) {
            continueButton.click();
            return true;
        }
        return false;
    }
}
