package AcreditareQA24.features;

import AcreditareQA24.utils.EnvConstants;
import org.junit.Test;

public class AdminTest extends BaseTest{

    @Test
    public void loginAdmin(){
        adminSteps.doAdminLogin(EnvConstants.ADMIN_NAME,EnvConstants.ADMIN_PASS);
        adminSteps.checkadminLoginMsg();
        adminSteps.checkadminMenu();
    }

    @Test
    public void logOutAdmin(){
        adminSteps.doAdminLogin(EnvConstants.ADMIN_NAME,EnvConstants.ADMIN_PASS);
        adminSteps.checkadminLoginMsg();
        adminSteps.checkadminMenu();
        adminSteps.doAdminLogout();

    }

    @Test
    public void createEmptyCoupon() {
        adminSteps.doAdminLogin(EnvConstants.ADMIN_NAME, EnvConstants.ADMIN_PASS);
        adminSteps.checkadminLoginMsg();
        adminSteps.checkadminMenu();
        adminSteps.setNewContent();
        adminSteps.createNewCoupon();
        adminSteps.checkCreateCouponPage();
        adminSteps.publishCoupon();
        adminSteps.checkCouponCreatedMessage();
    }

    @Test
    public void createandApplynewCoupon(){
        adminSteps.doAdminLogin(EnvConstants.ADMIN_NAME,EnvConstants.ADMIN_PASS);
        adminSteps.checkadminLoginMsg();
        adminSteps.checkadminMenu();
        adminSteps.setNewContent();
        adminSteps.createNewCoupon();
        adminSteps.checkCreateCouponPage();
        adminSteps.enterCouponCode("CPNTEST75");
        adminSteps.setDescriptionCode("This is a Test Coupon!");
        adminSteps.selectDiscountType();
        adminSteps.selectFixedCartDiscountType();
        adminSteps.setCouponAmount("5");
        adminSteps.setExpiryCouponDate("2024-05-20");
        adminSteps.publishCoupon();
        adminSteps.checkCouponCreatedMessage();
        adminSteps.returntoSite();
        loginSteps.doLogout();
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
        productSteps.clickViewCartButton();
        cartSteps.setCouponCode("CPNTEST75");
        cartSteps.applyCoupon();
        cartSteps.checkCouponSuccessMessage();
    }

    @Test
    public void createEmptyProduct(){
        adminSteps.doAdminLogin(EnvConstants.ADMIN_NAME,EnvConstants.ADMIN_PASS);
        adminSteps.checkadminLoginMsg();
        adminSteps.checkadminMenu();
        adminSteps.setNewContent();
        adminSteps.createNewProduct();
        adminSteps.checkCreateProductPage();
        adminSteps.publishProduct();
        adminSteps.newProductMessage();

    }
    @Test
    public void createandAddNewProducttoCart(){
        adminSteps.doAdminLogin(EnvConstants.ADMIN_NAME,EnvConstants.ADMIN_PASS);
        adminSteps.checkadminLoginMsg();
        adminSteps.checkadminMenu();
        adminSteps.setNewContent();
        adminSteps.createNewProduct();
        adminSteps.checkCreateProductPage();
        adminSteps.enterProductName("ProductTest3");
        adminSteps.setDescriptionText();
        adminSteps.setProductDescription("This is a product description test!");
        adminSteps.setRegularPrice("25");
        adminSteps.setShortDescriptionText();
        adminSteps.setProductShortDescription("Best Product!");
        adminSteps.selectInventoryTab();
        adminSteps.enterSKU("test-sku");
        adminSteps.manageStock();
        adminSteps.enterStockQty("4");
        adminSteps.selectShippingTab();
        adminSteps.enterProductWeightinKg("1");
        adminSteps.enterProductLenghtincm("25");
        adminSteps.enterProductWidthincm("25");
        adminSteps.enterProductHeightincm("25");
        adminSteps.publishProduct();
        adminSteps.newProductMessage();
        adminSteps.returntoSite();
        loginSteps.doLogout();
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
        cartSteps.emptyCart();
        searchSteps.searchForProduct("ProductTest3");
        searchSteps.verifySearchResult("ProductTest3");
        searchSteps.verifyProductisDisplayed("ProductTest3");
        searchSteps.findAndOpenProduct("ProductTest3");
        productSteps.clickAddtoCart();
        productSteps.verifyAddedToCart("ProductTest3");
        productSteps.clickViewCartButton();
    }

}
