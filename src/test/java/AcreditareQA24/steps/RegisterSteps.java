package AcreditareQA24.steps;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{

    @Step
    public void navigateToLogin_RegisterPage(){
        homePage.clickRegisterLink();
    }

    @Step
    public void enterNewUserCredentials(String email, String password) {
        loginPage.setRegisterUserEmail(email);
        loginPage.setRegisterUserPassword(password);
    }

    @Step
    public void clickregisterButton(){
        loginPage.clickRegisterButton();
    }

    @Step
    public void verifyRegisterMessage(String email){
        myAccountPage.verifyRegisterMessage(email);
    }

    @Step
    public void verifyInvalidLoginMessage(){
        myAccountPage.verifyInvalidLoginMessage();
    }
    @Step
    public void verifyUserExists(){
        myAccountPage.existingUserMessage();
    }

    @Step
    public void verifyEmptyField(){
        myAccountPage.verifyEmptyRegisterField();
    }
}
