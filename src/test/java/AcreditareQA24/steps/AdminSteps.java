package AcreditareQA24.steps;

import AcreditareQA24.utils.EnvConstants;
import net.thucydides.core.annotations.Step;

public class AdminSteps extends BaseSteps{

    @Step
    public void navigateToAdminHomePage(){
        getDriver().get(EnvConstants.ADMIN_BASE_URL);
    }

    @Step
    public void adminNavigatetoLogin() {
        adminPage.adminclickLoginLink();
    }

    @Step
    public void adminenterCredentials(String username, String pass){
        adminPage.setadminUsernameField(username);
        adminPage.setadminPassField(pass);
    }

    @Step
    public void adminclickLogin() {
        adminPage.adminclickLogin();
    }

    @Step
    public void doAdminLogin(String user, String pass) {
        adminNavigatetoLogin();
        adminenterCredentials(user, pass);
        adminclickLogin();
    }

    @Step
    public void doAdminLogout(){
        adminPage.adminLogOutButton();
    }

    @Step
    public void checkadminLoginMsg(){
        adminPage.admincheckLogin();
    }

    @Step
    public void checkadminMenu(){
        adminPage.checkadminMenu();
    }

    @Step
    public void setSiteName(){
        adminPage.setSiteName();
    }

    @Step
    public void clickViewSite(){
        adminPage.setViewSite();
    }

    @Step
    public void clickViewStore(){
        adminPage.setViewStore();
    }

    @Step
    public void returntoSite(){
        setSiteName();
        clickViewSite();
    }

    @Step
    public void returntoStore(){
        setSiteName();
        clickViewStore();
    }

    @Step
    public void setNewContent(){
        adminPage.setNewContent();
    }

    @Step
    public void createNewProduct(){
        adminPage.createNewProduct();
    }

    @Step
    public void checkCreateProductPage(){
        adminPage.checkCreateProductPage();
    }

    @Step
    public void enterProductName(String productName){
        adminPage.setProductName(productName);
    }

    @Step
    public void setDescriptionText(){
        adminPage.selectText();
    }

    @Step
    public void setShortDescriptionText(){
        adminPage.selectShortText();
    }

    @Step
    public void setProductDescription(String description){
        adminPage.setProductDescription(description);
    }

    @Step
    public void setProductShortDescription(String description){
        adminPage.setShortProductDescription(description);
    }

    @Step
    public void setRegularPrice(String regPrice){
        adminPage.setRegularPrice(regPrice);
    }

    @Step
    public void setSalePrice(String SalePrice){
        adminPage.setSalePrice(SalePrice);
    }

    @Step
    public void selectInventoryTab(){
        adminPage.clickPrductInventoryTab();
    }

    @Step
    public void enterSKU(String SKU){
        adminPage.addSKU(SKU);
    }

    @Step
    public void manageStock(){
        adminPage.setEnableStock();
    }

    @Step
    public void enterStockQty(String qty){
        adminPage.setStockQty(qty);
    }

    @Step
    public void selectShippingTab(){
        adminPage.clickPrductShippingTab();
    }

    @Step
    public void enterProductWeightinKg(String weight){
        adminPage.setProductWeight(weight);
    }

    @Step
    public void enterProductLenghtincm(String lenght){
        adminPage.setProductLenght(lenght);
    }

    @Step
    public void enterProductWidthincm(String width){
        adminPage.setProductWidth(width);
    }

    @Step
    public void enterProductHeightincm(String height){
        adminPage.setProductHeight(height);
    }

    @Step
    public void publishProduct(){
        adminPage.publishNewProductButton();
    }

    @Step
    public void newProductMessage(){
        adminPage.newProductMessage();
    }

    @Step
    public void createNewCoupon(){
        adminPage.createNewCoupon();
    }

    @Step
    public void checkCreateCouponPage(){
        adminPage.checkCreateCouponPage();
    }

    @Step
    public void enterCouponCode(String Code){
        adminPage.setCouponCode(Code);
    }

    @Step
    public void setDescriptionCode(String Description){
        adminPage.setDescriptionCode(Description);
    }

    @Step
    public void selectDiscountType(){
        adminPage.discountTypeDropdown();
    }

    @Step
    public void selectPercentDiscountType(){
        adminPage.percentDiscountType();
    }

    @Step
    public void selectFixedCartDiscountType() {
        adminPage.fixedCartDiscountType();
    }

    @Step
    public void selectFixedProductDiscountType() {
        adminPage.fixedProductDiscountType();
    }

    @Step
    public void setCouponAmount(String amount){
        adminPage.setCouponAmount(amount);
    }

    @Step
    public void setExpiryCouponDate(String yyyy_mm_dd){
        adminPage.setExpiryCouponDate(yyyy_mm_dd);
    }

    @Step
    public void publishCoupon(){
        adminPage.publishCouponButton();
    }

    @Step
    public void checkCouponCreatedMessage(){
        adminPage.couponMessage();
    }
}
