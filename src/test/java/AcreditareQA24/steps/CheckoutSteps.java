package AcreditareQA24.steps;

import ch.qos.logback.core.encoder.EchoEncoder;
import io.cucumber.java.an.E;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void navigatetoCheckoutPage() {
        homePage.clickOnCheckoutButton();
    }

    @Step
    public void verifyCheckoutPage() {
        checkoutPage.checkCheckoutPage("Checkout");
    }

    @Step
    public void verifyRequiredField() {
        checkoutPage.checkRequiredFieldError();
    }

    @Step
    public void clickPlaceOrderButton() {
        checkoutPage.PlaceOrderButton();
    }

    @Step
    public void setFirstNameField(String FirstName) {
        checkoutPage.FirstNameField(FirstName);
    }

    @Step
    public void setShippingFirstNameField(String FirstName) {
        checkoutPage.ShippingFirstNameField(FirstName);
    }

    @Step
    public void setShippingLastNameField(String LastName) {
        checkoutPage.ShippingLastNameField(LastName);
    }

    @Step
    public void setLastNameField(String LastName) {
        checkoutPage.LastNameField(LastName);
    }

    @Step
    public void setBillingCompany(String Company) {
        checkoutPage.BillingCompany(Company);
    }

    @Step
    public void setShippingBillingCompany(String Company) {
        checkoutPage.ShippingBillingCompany(Company);
    }

    @Step
    public void SelectCountry(String Country) {
        checkoutPage.SelectCountryDropdown();
        checkoutPage.setCountry(Country);
    }

    @Step
    public void SelectShippingCountry(String Country) {
        checkoutPage.SelectShippingCountryDropdown();
        checkoutPage.setCountry(Country);
    }

    @Step
    public void setAdress1(String Adress1) {
        checkoutPage.setAdress1(Adress1);
    }

    @Step
    public void setAdress2(String Adress2) {
        checkoutPage.setAdress2(Adress2);
    }

    @Step
    public void setshippingAdress1(String Adress1) {
        checkoutPage.setshippingAdress1(Adress1);
    }

    @Step
    public void setshippingAdress2(String Adress2) {
        checkoutPage.setshippingAdress2(Adress2);
    }

    @Step
    public void setCity(String City) {
        checkoutPage.setCity(City);
    }

    @Step
    public void setShippingCity(String City) {
        checkoutPage.setShippingCity(City);
    }

    @Step
    public void SelectState(String State){
        checkoutPage.SelectStateDropdown();
        checkoutPage.setState(State);
    }

    @Step
    public void SelectShippingState(String State){
        checkoutPage.SelectShippingStateDropdown();
        checkoutPage.setState(State);
    }

    @Step
    public void setPostcode(String Postcode){
        checkoutPage.setPostcode(Postcode);
    }

    @Step
    public void setShippingPostcode(String Postcode){
        checkoutPage.setShippingPostcode(Postcode);
    }

    @Step
    public void setPhoneNr(String PhoneNr){
        checkoutPage.setPhone(PhoneNr);
    }

    @Step
    public void setEmail(String Email){
        checkoutPage.setEmail(Email);
    }

    @Step
    public void setDifferentAddress(){
        checkoutPage.setDifferentAdress();
    }

    @Step
    public void setOrderComment(String Comment){
        checkoutPage.setOrderComment(Comment);
    }




}
