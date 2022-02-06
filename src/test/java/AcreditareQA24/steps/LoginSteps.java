package AcreditareQA24.steps;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends BaseSteps{

    @Step
    public void navigateToLogin_RegisterPage(){
        homePage.clickLoginLink();
    }

    @Step
    public void enterCredentials(String username, String pass){
        loginPage.setUsernameField(username);
        loginPage.setPassField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step
    public void clickLogOut(){
        myAccountPage.clickLogOutButton();
    }

    @Step
    public void doLogin(String user, String pass){
        navigateToLogin_RegisterPage();
        enterCredentials(user, pass);
        clickLogin();
    }

    @Step
    public void doLogout(){
        homePage.clickOnMyAccountButton();
        clickLogOut();

    }

    @Step
    public void checkLoginMsg(String username){
        myAccountPage.checkLogin(username);
    }

    @Step
    public void verifuInvalidUsername() {
        myAccountPage.verifyInvalidUsername();
    }

    @Step
    public void verifyInvalidPassword(String username) {
        myAccountPage.verifyInvalidPassword(username);
    }

    @Step
    public void verifyEmptyFields() {
        myAccountPage.verifyEmptyFields();
    }

    public void verifyEmptyPassFields() {
        myAccountPage.verifyEmptyPassFields();
    }
}
