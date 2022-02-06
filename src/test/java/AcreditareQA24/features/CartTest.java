package AcreditareQA24.features;

import AcreditareQA24.utils.EnvConstants;
import org.junit.Test;


public class CartTest extends BaseTest{

    @Test
    public void addtoCart(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        shopSteps.clickOnShopButton();
        shopSteps.selectProduct();
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("aaa");
    }

    @Test
    public void addtoCartfromShopPage() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        shopSteps.clickOnShopButton();
        shopSteps.clickOnAddButton();
    }

    @Test
    public void addtoCartfromSearch(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        searchSteps.searchForProduct("Album");
        searchSteps.verifySearchResult("Album");
        searchSteps.verifyProductisDisplayed("Album");
        searchSteps.findAndOpenProduct("Album");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Album");
    }

    @Test
    public void addtoCartfromSearch1(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        searchSteps.searchForProduct("Single");
        searchSteps.verifySearchResult("Single");
        searchSteps.verifyProductisDisplayed("Single");
        searchSteps.findAndOpenProduct("Single");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Single");
    }

    @Test
    public void addMultipleProductsToCart()  {
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("Single");
        searchSteps.verifySearchResult("Single");
        searchSteps.verifyProductisDisplayed("Single");
        searchSteps.findAndOpenProduct("Single");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Single");
        searchSteps.searchForProduct("aaa");
        searchSteps.verifySearchResult("aaa");
        searchSteps.verifyProductisDisplayed("aaa");
        searchSteps.findAndOpenProduct("aaa");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("aaa");
        searchSteps.searchForProduct("Album");
        searchSteps.verifySearchResult("Album");
        searchSteps.verifyProductisDisplayed("Album");
        searchSteps.findAndOpenProduct("Album");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Album");
        searchSteps.searchForProduct("Cap");
        searchSteps.verifySearchResult("Cap");
        searchSteps.verifyProductisDisplayed("Cap");
        searchSteps.findAndOpenProduct("Cap");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Cap");
    }

    @Test
    public void removeAllItemsfromCart(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        cartSteps.checkifCartisEmpty();
    }

    @Test
    public void removeSpecificProductfromCart(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        searchSteps.searchForProduct("Cap");
        searchSteps.verifySearchResult("Cap");
        searchSteps.verifyProductisDisplayed("Cap");
        searchSteps.findAndOpenProduct("Cap");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Cap");
        searchSteps.searchForProduct("Bag");
        searchSteps.verifySearchResult("Bag");
        searchSteps.verifyProductisDisplayed("Bag");
        searchSteps.findAndOpenProduct("Bag");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Bag");
        cartSteps.clickOnCartButton();
        cartSteps.removeSpecificProduct("Bag");
        cartSteps.checkRemoveItemSuccess();

    }

    @Test
    public void addincreasedProductQuantitytoCart() {
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("Sunglasses");
        searchSteps.verifySearchResult("Sunglasses");
        searchSteps.verifyProductisDisplayed("Sunglasses");
        searchSteps.findAndOpenProduct("Sunglasses");
        cartSteps.addProductQuantity("5");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Sunglasses");
        cartSteps.verifyCartQuantity("5");
    }

    @Test
    public void updateProductQuantityfromCart() {
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("Cap");
        searchSteps.verifySearchResult("Cap");
        searchSteps.verifyProductisDisplayed("Cap");
        searchSteps.findAndOpenProduct("Cap");
        cartSteps.addProductQuantity("5");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Cap");
        cartSteps.verifyCartQuantity("5");
        productSteps.clickViewCartButton();
        cartSteps.updateProductQty("10");
        cartSteps.verifyCartQuantity("10");
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkTotalPriceIsCorrect();
    }

    @Test
    public void checkCartTotalSummaryTest() {
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.clickOnCartButton();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkTotalPriceIsCorrect();
    }

    @Test
    public void applyInvalidCoupon(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        searchSteps.searchForProduct("T-Shirt");
        searchSteps.verifySearchResult("T-Shirt");
        searchSteps.verifyProductisDisplayed("T-Shirt");
        searchSteps.findAndOpenProduct("T-Shirt");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("T-Shirt");
        productSteps.clickViewCartButton();
        cartSteps.setCouponCode("T-Shirt25");
        cartSteps.applyCoupon();
        cartSteps.checkCouponInvalidMessage("t-shirt25");
    }

    @Test
    public void addCollectionToCart(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        searchSteps.searchForProduct("Logo Collection");
        searchSteps.verifySearchResult("Logo Collection");
        searchSteps.verifyProductisDisplayed("Logo Collection");
        searchSteps.findAndOpenProduct("Logo Collection");
        productSteps.setFirstCollectionProductQty("1");
        productSteps.setSecondCollectionProductQty("3");
        productSteps.setThirdCollectionProductQty("2");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("Hoodie with Logo”, “T-Shirt” and “Beanie");
    }


}
