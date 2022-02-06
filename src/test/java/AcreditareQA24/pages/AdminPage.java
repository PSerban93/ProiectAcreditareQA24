package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.time.Duration;

public class AdminPage extends BasePage {

    @FindBy(css = ".site-header-right-link [title=Login]")
    private WebElementFacade adminloginLink;

    @FindBy(id = "username")
    private WebElementFacade adminusernameField;

    @FindBy(id = "password")
    private WebElementFacade adminpassField;

    @FindBy(css = ".u-column1 .woocommerce-Button")
    private WebElementFacade adminloginbutton;

    @FindBy(id = "wp-admin-bar-logout")
    private WebElementFacade adminlogoutbutton;

    @FindBy(css = ".woocommerce-MyAccount-content p")
    private WebElementFacade adminloginMessage;

    @FindBy(css = ".ab-top-menu .with-avatar a")
    private WebElementFacade checkadminMenu;

    @FindBy(id = "wp-admin-bar-site-name")
    private WebElementFacade siteName;

    @FindBy(id = "wp-admin-bar-view-site")
    private WebElementFacade viewSite;

    @FindBy(id = "wp-admin-bar-view-store")
    private WebElementFacade viewStore;

    @FindBy(id = "wp-admin-bar-new-content")
    private WebElementFacade newContent;

    @FindBy(id = "wp-admin-bar-new-product")
    private WebElementFacade newProduct;

    @FindBy(css = ".wp-heading-inline")
    private WebElementFacade checkCreateProductPage;

    @FindBy(css = "#title[name=\"post_title\"]")
    private WebElementFacade productName;

    @FindBy(id = "content-html")
    private WebElementFacade selectDescriptionText;

    @FindBy(id = "excerpt-html")
    private WebElementFacade selectShortDescriptionText;

    @FindBy(css = "#content.wp-editor-area")
    private WebElementFacade productDescription;

    @FindBy(css = "#excerpt.wp-editor-area")
    private WebElementFacade productShortDescription;

    @FindBy(id = "_regular_price")
    private WebElementFacade regularPrice;

    @FindBy(id = "_sale_price")
    private WebElementFacade salePrice;

    @FindBy(css = ".inventory_options a")
    private WebElementFacade inventorytab;

    @FindBy(id = "_sku")
    private WebElementFacade sku;

    @FindBy(id = "_manage_stock")
    private WebElementFacade enableStock;

    @FindBy(id = "_stock")
    private WebElementFacade stockQty;

    @FindBy(css = ".shipping_options a")
    private WebElementFacade shippingtab;

    @FindBy(id = "_weight")
    private WebElementFacade productWeight;

    @FindBy(id = "product_length")
    private WebElementFacade productLenght;

    @FindBy(name = "_width")
    private WebElementFacade productWidth;

    @FindBy(name = "_height")
    private WebElementFacade productHeight;

    @FindBy(id = "publish")
    private WebElementFacade publishNewProduct;

    @FindBy(css = ".notice-success p")
    private WebElementFacade newProductMessage;

    @FindBy(id = "wp-admin-bar-new-shop_coupon")
    private WebElementFacade newCoupon;

    @FindBy(css = ".wp-heading-inline")
    private WebElementFacade checkCreateCouponPage;

    @FindBy(css = "#title[name=\"post_title\"]")
    private WebElementFacade couponCode;

    @FindBy(id = "woocommerce-coupon-description")
    private WebElementFacade descriptionCode;

    @FindBy(id = "discount_type")
    private WebElementFacade discountTypeDropdown;

    @FindBy(css = ".short option:nth-child(1)")
    private WebElementFacade percentDiscountType;

    @FindBy(css = ".short option:nth-child(2)")
    private WebElementFacade fixedCartDiscountType;

    @FindBy(css = ".short option:nth-child(3)")
    private WebElementFacade fixedProductDiscountType;

    @FindBy(id = "coupon_amount")
    private WebElementFacade couponAmount;

    @FindBy(css = ".expiry_date_field input")
    private WebElementFacade expiryCouponDate;

    @FindBy(id = "publish")
    private WebElementFacade publishCoupon;

    @FindBy(css = ".notice-success p")
    private WebElementFacade couponMessage;



    public void adminclickLoginLink(){
        clickOn(adminloginLink);
    }

    public void setadminUsernameField(String username){
        typeInto(adminusernameField, username);
    }

    public void setadminPassField(String password){
        clickOn(adminpassField);
        typeInto(adminpassField, password);
    }

    public void adminclickLogin(){
        clickOn(adminloginbutton);
    }

    public void adminLogOutButton(){
        moveTo(By.cssSelector(".ab-top-menu .with-avatar a"));
        clickOn(adminlogoutbutton);
    }

    public void admincheckLogin() {
        waitFor(adminloginMessage);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(adminloginMessage);
        adminloginMessage.shouldContainOnlyText("Hello admin (not admin? Log out)");
    }

    public void checkadminMenu() {
        waitFor(checkadminMenu);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(checkadminMenu);
        checkadminMenu.shouldContainOnlyText("Howdy, admin");
    }

    public void setSiteName(){
        moveTo(By.id("wp-admin-bar-site-name"));
    }

    public void setViewSite(){
        clickOn(viewSite);
    }

    public void setViewStore(){
        clickOn(viewStore);
    }

    public void setNewContent(){
        moveTo(By.id("wp-admin-bar-new-content"));
    }

    public void createNewProduct() {
        clickOn(newProduct);
    }

    public void checkCreateProductPage(){
        checkCreateCouponPage.shouldContainOnlyText("Add new product");
    }

    public void setProductName(String Name){
        typeInto(productName, Name);
    }

    public void selectText(){
        clickOn(selectDescriptionText);
    }

    public void selectShortText(){
        clickOn(selectShortDescriptionText);
    }

    public void setProductDescription(String Description){
        typeInto(productDescription, Description);
    }

    public void setShortProductDescription(String Description){
        typeInto(productShortDescription, Description);
    }

    public void setRegularPrice(String regPrice){
        typeInto(regularPrice, regPrice);
    }

    public void setSalePrice(String SalePrice){
        typeInto(salePrice, SalePrice);
    }

    public void clickPrductInventoryTab(){
        clickOn(inventorytab);
    }

    public void addSKU(String SKU){
        typeInto(sku, SKU);
    }

    public void setEnableStock(){
        clickOn(enableStock);
    }

    public void setStockQty(String qty){
        typeInto(stockQty, qty);
    }

    public void clickPrductShippingTab(){
        clickOn(shippingtab);
    }

    public void setProductWeight(String weight){
        typeInto(productWeight, weight);
    }

    public void setProductLenght(String lenght){
        typeInto(productLenght, lenght);
    }

    public void setProductWidth(String width){
        typeInto(productWidth, width);
    }

    public void setProductHeight(String height){
        typeInto(productHeight, height);
    }

    public void publishNewProductButton(){
        clickOn(publishNewProduct);
    }

    public void newProductMessage(){
        newProductMessage.shouldContainOnlyText("Product published. View Product");
    }

    public void createNewCoupon() {
        clickOn(newCoupon);
    }

    public void checkCreateCouponPage(){
        checkCreateCouponPage.shouldContainOnlyText("Add new coupon");
    }

    public void setCouponCode(String Code){
        typeInto(couponCode, Code);
    }

    public void setDescriptionCode(String Description){
        typeInto(descriptionCode, Description);
    }

    public void discountTypeDropdown(){
        clickOn(discountTypeDropdown);
    }

    public void percentDiscountType(){
        clickOn(percentDiscountType);
    }

    public void fixedCartDiscountType(){
        clickOn(fixedCartDiscountType);
    }

    public void fixedProductDiscountType(){
        clickOn(fixedProductDiscountType);
    }

    public void setCouponAmount(String amount){
        typeInto(couponAmount, amount);
    }

    public void setExpiryCouponDate(String date){
        typeInto(expiryCouponDate, date);
    }

    public void publishCouponButton(){
        clickOn(publishCoupon);
    }

    public void couponMessage(){
        couponMessage.shouldContainOnlyText("Coupon updated.");
    }




}
