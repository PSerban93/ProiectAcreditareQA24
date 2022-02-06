package AcreditareQA24.features;

import AcreditareQA24.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void proceedtoCheckout() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("Bag");
        searchSteps.findAndOpenProduct("Bag");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Bag");
        productSteps.clickViewCartButton();
        cartSteps.clickChechoutButton();
        checkoutSteps.verifyCheckoutPage();
    }

    @Test
    public void placeInvalidOrder() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("Cap");
        searchSteps.verifyProductisDisplayed("Cap");
        searchSteps.findAndOpenProduct("Cap");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Cap");
        productSteps.clickViewCartButton();
        cartSteps.clickChechoutButton();
        checkoutSteps.verifyCheckoutPage();
        checkoutSteps.setFirstNameField("");
        checkoutSteps.setLastNameField("");
        checkoutSteps.setBillingCompany("");
        checkoutSteps.SelectCountry("");
        checkoutSteps.setAdress1("");
        checkoutSteps.setCity("");
        checkoutSteps.SelectState("");
        checkoutSteps.setPostcode("");
        checkoutSteps.setPhoneNr("");
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.verifyRequiredField();
    }

    @Test
    public void compelteCheckout() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("Beanie");
        searchSteps.verifyProductisDisplayed("Beanie");
        searchSteps.findAndOpenProduct("Beanie");
        productSteps.verifyAddedToCart("Beanie");
        productSteps.clickAddtoCart();
        productSteps.clickViewCartButton();
        cartSteps.clickChechoutButton();
        checkoutSteps.verifyCheckoutPage();
        checkoutSteps.setFirstNameField("Serban");
        checkoutSteps.setLastNameField("Perseca");
        checkoutSteps.setBillingCompany("");
        checkoutSteps.SelectCountry("Romania");
        checkoutSteps.setAdress1("Calea Moldovei 6");
        checkoutSteps.setCity("Bistrita");
        checkoutSteps.SelectState("Bistrita-Nasaud");
        checkoutSteps.setPostcode("423657");
        checkoutSteps.setPhoneNr("0725617685");
        checkoutSteps.clickPlaceOrderButton();
    }

    @Test
    public void checkoutonDifferentAddress() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("Beanie");
        searchSteps.verifyProductisDisplayed("Beanie");
        searchSteps.findAndOpenProduct("Beanie");
        productSteps.verifyAddedToCart("Beanie");
        productSteps.clickAddtoCart();
        productSteps.clickViewCartButton();
        cartSteps.clickChechoutButton();
        checkoutSteps.verifyCheckoutPage();
        checkoutSteps.setFirstNameField("Serban");
        checkoutSteps.setLastNameField("Perseca");
        checkoutSteps.setBillingCompany("");
        checkoutSteps.SelectCountry("Romania");
        checkoutSteps.setAdress1("Calea Moldovei 6");
        checkoutSteps.setCity("Bistrita");
        checkoutSteps.SelectState("Bistrita-Nasaud");
        checkoutSteps.setPostcode("423657");
        checkoutSteps.setPhoneNr("0725617685");
        checkoutSteps.setEmail("Iondintufe@mailinator.com");
        checkoutSteps.setDifferentAddress();
        checkoutSteps.setShippingFirstNameField("Tufe");
        checkoutSteps.setShippingLastNameField("Ion");
        checkoutSteps.setShippingBillingCompany("Tufe SRL");
        checkoutSteps.SelectShippingCountry("Romania");
        checkoutSteps.setshippingAdress1("Str. Tufelor 10");
        checkoutSteps.setShippingCity("Cluj-Napoca");
        checkoutSteps.SelectShippingState("Cluj");
        checkoutSteps.setShippingPostcode("123456");
        checkoutSteps.setOrderComment("Daca se poate Transportul sa fie cu Elicopterul!");
        checkoutSteps.clickPlaceOrderButton();
    }

}
