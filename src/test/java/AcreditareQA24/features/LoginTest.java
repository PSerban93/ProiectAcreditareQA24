package AcreditareQA24.features;

import AcreditareQA24.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        loginSteps.checkLoginMsg(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithInvalidCredentials(){
        loginSteps.doLogin("Serban","123321");
        loginSteps.verifuInvalidUsername();
    }

    @Test
    public void loginWithInvalidUser() {
        loginSteps.navigateToLogin_RegisterPage();
        loginSteps.enterCredentials("Invalid", EnvConstants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifuInvalidUsername();
    }

    @Test
    public void loginWithInvalidPass() {
        loginSteps.navigateToLogin_RegisterPage();
        loginSteps.enterCredentials(EnvConstants.USER_NAME, "InvalidPass");
        loginSteps.clickLogin();
        loginSteps.verifyInvalidPassword(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithEmptyFields() {
        loginSteps.navigateToLogin_RegisterPage();
        loginSteps.clickLogin();
        loginSteps.verifyEmptyFields();
    }

    @Test
    public void loginWithEmptyUser() {
        loginSteps.navigateToLogin_RegisterPage();
        loginSteps.enterCredentials(" ",EnvConstants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyEmptyFields();
    }

    @Test
    public void loginWithEmptyPass() {
        loginSteps.navigateToLogin_RegisterPage();
        loginSteps.enterCredentials(EnvConstants.USER_NAME,"");
        loginSteps.clickLogin();
        loginSteps.verifyEmptyPassFields();
    }
}
