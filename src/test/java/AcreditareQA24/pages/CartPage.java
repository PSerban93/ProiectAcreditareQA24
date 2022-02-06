package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

public class CartPage extends BasePage {


    @FindBy(name = "update_cart")
    private WebElementFacade updateCartButton;

    @FindBy(css = ".header-cart-amount")
    private WebElementFacade cartQuantity;

    @FindBy(css = ".qty")
    private WebElementFacade productQuantity;

    @FindBy(css = "tr.cart_item")
    private List<WebElementFacade> cartProductsList;

    @FindBy(css = ".product-remove .remove")
    private WebElementFacade removefromCartButton;

    @FindBy(css = ".woocommerce-message .restore-item")
    public WebElementFacade removeSuccess;

    @FindBy(css = ".cart-empty")
    public WebElementFacade cartisEmptyMsg;

    @FindBy(css = ".checkout-button")
    public WebElementFacade checkoutButton;

    @FindBy(css = ".product-subtotal .amount")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy(css = ".cart-subtotal .amount")
    private WebElementFacade subtotalText;

    @FindBy(css = ".order-total .amount")
    private WebElementFacade TotalText;

    @FindBy(css = ".coupon .input-text")
    private WebElementFacade couponField;

    @FindBy(css = ".coupon .button")
    private WebElementFacade applyCouponButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successCouponMsg;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade invalidCouponMsg;


    public void getQuantityfromCart() {
        if (cartQuantity.isPresent())
            cartQuantity.getText();
    }

    public void verifyCartQuantity(String qty) {
        waitABit(3000);
        cartQuantity.shouldContainText(qty);
    }

    public void addQuantity(String value) {
        typeInto(productQuantity, value);
    }

    public void checkifCartisEmpty() {
        cartisEmptyMsg.shouldContainOnlyText("Your cart is currently empty.");
    }

    public void removefromCartButton() {
        while (removefromCartButton.isPresent()) {
            waitABit(3000);
            clickOn(removefromCartButton);
            if (cartisEmptyMsg.isPresent())
                //System.out.println("Cart is Empty!");
                cartisEmptyMsg.shouldBePresent();
        }
    }

    public boolean removeSpecificProductfromCart(String ProductName) {
        waitFor(cartProductsList.get(0));
        for (WebElementFacade element : cartProductsList){
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(ProductName)) {
                element.findElement(By.cssSelector(".product-remove a")).click();
                return true;
            }
        }
        return false;
    }

    public void checkremoveItemSuccess() {
        if (removeSuccess.isPresent()) {
            removeSuccess.shouldContainOnlyText("Undo?");
            if (cartisEmptyMsg.isPresent())
                cartisEmptyMsg.shouldBePresent();
        }
    }

    public void updateProductQuantity(String Qty){
        typeInto(productQuantity, Qty);
        clickOn(updateCartButton);
    }

    public void CheckoutButton() {
        if (checkoutButton.isPresent())
            clickOn(checkoutButton);
    }

    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public boolean isTotalPriceCorrect(){
        return getSubtotalPricesCalculated() == getIntFromPrice(TotalText.getText());
    }

    public void setCouponField(String couponCode){
        typeInto(couponField, couponCode);
    }

    public void couponButton(){
        clickOn(applyCouponButton);
    }

    public void applyCouponSuccessMsg(){
        successCouponMsg.shouldContainOnlyText("Coupon code applied successfully.");
    }

    public void couponNotExist(String couponCode){
        invalidCouponMsg.shouldContainOnlyText("Coupon \""+couponCode+"\" does not exist!");
    }


}
