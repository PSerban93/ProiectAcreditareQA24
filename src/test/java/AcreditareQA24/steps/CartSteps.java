package AcreditareQA24.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void clickOnCartButton() {
        homePage.clickOnCartButton();
    }

    @Step
    public void checkRemoveItemSuccess(){
        cartPage.checkremoveItemSuccess();
    }

    @Step
    public void addProductQuantity(String value){
        cartPage.addQuantity(value);
    }

    @Step
    public void verifyCartQuantity(String qty) {
        cartPage.verifyCartQuantity(qty);
    }

    @Step
    public void emptyCart() {
        homePage.clickOnCartButton();
        cartPage.removefromCartButton();
        cartPage.checkremoveItemSuccess();
    }

    @Step
    public void removeSpecificProduct(String ProductName){
        cartPage.removeSpecificProductfromCart(ProductName);
    }

    @Step
    public void checkifCartisEmpty(){
        cartPage.checkifCartisEmpty();
    }

    @Step
    public void updateProductQty(String Qty) {
        cartPage.updateProductQuantity(Qty);
    }

    @Step
    public void clickChechoutButton() {
        cartPage.CheckoutButton();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void checkTotalPriceIsCorrect() {
        Assert.assertTrue("Total price not correct", cartPage.isTotalPriceCorrect());
    }

    @Step
    public void setCouponCode(String couponCode){
        cartPage.setCouponField(couponCode);
    }

    @Step
    public void applyCoupon(){
        cartPage.couponButton();
    }

    @Step
    public void checkCouponSuccessMessage(){
        cartPage.applyCouponSuccessMsg();

    }
    @Step
    public void checkCouponInvalidMessage(String couponCode){
        cartPage.couponNotExist(couponCode);
    }

}
