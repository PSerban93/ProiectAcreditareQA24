package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class CheckoutPage extends BasePage {

    @FindBy (css = ".entry-title")
    private WebElementFacade CheckoutTitle;

    @FindBy (css = ".woocommerce-error li")
    private WebElementFacade RequiredFieldError;

    @FindBy (css = ".place-order button")
    private WebElementFacade PlaceOrderButton;

    @FindBy (id = "billing_first_name")
    private WebElementFacade FirstNameField;

    @FindBy (id = "shipping_first_name")
    private WebElementFacade ShippingFirstNameField;

    @FindBy (id = "billing_last_name")
    private WebElementFacade LastNameField;

    @FindBy (id = "shipping_last_name")
    private WebElementFacade ShippingLastNameField;

    @FindBy (id = "billing_company")
    private WebElementFacade BillingCompany;

    @FindBy (id = "shipping_company")
    private WebElementFacade ShippingBillingCompany;

    @FindBy (id = "select2-billing_country-container")
    private WebElementFacade SelectCountryDropdown;

    @FindBy (id = "select2-shipping_country-container")
    private WebElementFacade SelectShippingCountryDropdown;

    @FindBy (css = ".select2-search input")
    private WebElementFacade setCountry;

    @FindBy (id = "billing_address_1")
    private WebElementFacade setAdress1;

    @FindBy (id = "billing_address_2")
    private WebElementFacade setAdress2;

    @FindBy (id = "shipping_address_1")
    private WebElementFacade setshippingAdress1;

    @FindBy (id = "shipping_address_2")
    private WebElementFacade setshippingAdress2;

    @FindBy (id = "billing_city")
    private WebElementFacade setCity;

    @FindBy (id = "shipping_city")
    private WebElementFacade setShippingCity;

    @FindBy (id = "select2-billing_state-container")
    private WebElementFacade SelectStateDropdown;

    @FindBy (id = "select2-shipping_state-container")
    private WebElementFacade SelectShippingStateDropdown;

    @FindBy (css = ".select2-search input")
    private WebElementFacade setState;

    @FindBy (id = "billing_postcode")
    private WebElementFacade setPostcode;

    @FindBy(id = "shipping_postcode")
    private WebElementFacade setShippingPostcode;

    @FindBy(id = "billing_phone")
    private WebElementFacade setPhone;

    @FindBy(id = "billing_email")
    private WebElementFacade setEmail;

    @FindBy(name = "ship_to_different_address")
    private WebElementFacade shipDifferentAddress;

    @FindBy(id = "order_comments")
    private WebElementFacade orderComment;

    public void checkCheckoutPage(String Checkoutpage){
        CheckoutTitle.shouldContainOnlyText("Checkout");
    }

    public void checkRequiredFieldError(){
        RequiredFieldError.shouldContainOnlyText("Billing First name is a required field.");
    }

    public void PlaceOrderButton(){
        clickOn(PlaceOrderButton);
    }

    public void FirstNameField(String FirstName){
        typeInto(FirstNameField, FirstName);
    }

    public void ShippingFirstNameField(String FirstName){
        typeInto(ShippingFirstNameField, FirstName);
    }

    public void LastNameField(String LastName){
        typeInto(LastNameField, LastName);
    }

    public void ShippingLastNameField(String LastName){
        typeInto(ShippingLastNameField, LastName);
    }

    public void BillingCompany(String Company){
        typeInto(BillingCompany, Company);
    }

    public void ShippingBillingCompany(String Company){
        typeInto(ShippingBillingCompany, Company);
    }

    public void SelectShippingCountryDropdown(){
        clickOn(SelectShippingCountryDropdown);
    }

    public void SelectCountryDropdown(){
        clickOn(SelectCountryDropdown);
    }

    public void setCountry(String Country){
        typeInto(setCountry, Country);
        setCountry.sendKeys(ENTER);
    }

    public void setAdress1(String Adress1){
        typeInto(setAdress1, Adress1);
    }

    public void setAdress2(String Adress2){
        typeInto(setAdress2, Adress2);
    }

    public void setshippingAdress1(String Adress1){
        typeInto(setshippingAdress1, Adress1);
    }

    public void setshippingAdress2(String Adress2){
        typeInto(setshippingAdress2, Adress2);
    }

    public void setCity(String City){
        typeInto(setCity, City);
    }

    public void setShippingCity(String City){
        typeInto(setShippingCity, City);
    }

    public void SelectStateDropdown(){
        clickOn(SelectStateDropdown);
    }

    public void setState(String State){
        typeInto(setCountry, State);
        setCountry.sendKeys(ENTER);
    }

    public void SelectShippingStateDropdown(){
        clickOn(SelectShippingStateDropdown);
    }

    public void setPostcode(String Postcode) {
        typeInto(setPostcode, Postcode);
    }

    public void setShippingPostcode(String Postcode) {
        typeInto(setShippingPostcode, Postcode);
    }

    public void setPhone(String PhoneNr){
        typeInto(setPhone, PhoneNr);
    }

    public void setEmail(String Email){
        setEmail.clear();
        typeInto(setEmail, Email);
    }

    public void setDifferentAdress(){
        clickOn(shipDifferentAddress);
    }

    public void setOrderComment(String Comment){
        typeInto(orderComment, Comment);
    }

}
