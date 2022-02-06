package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class ShopPage extends BasePage{


    @FindBy(css = ".post-2880 .woocommerce-placeholder")
    private WebElementFacade productToAdd;

    @FindBy(css = ".add_to_cart_button")
    private WebElementFacade addToCartButton;


    public void clickOnSelectedProduct() {
        clickOn(productToAdd);}

    public void clickOnAddButton() {
        if (addToCartButton.isPresent()) {
            addToCartButton.click();
        }
    }


}
