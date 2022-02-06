package AcreditareQA24.features;

import AcreditareQA24.utils.EnvConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registernewUser() {
        registerSteps.navigateToLogin_RegisterPage();
        String email = RandomStringUtils.randomAlphanumeric(6);
        String pass = RandomStringUtils.randomAlphanumeric(10);
        registerSteps.enterNewUserCredentials(email+"@mailinator.com", pass);
        registerSteps.clickregisterButton();
        registerSteps.verifyRegisterMessage(email);
    }

    @Test
    public void registerwithUnlimitedUserCrct() {
        registerSteps.navigateToLogin_RegisterPage();
        String email = RandomStringUtils.randomAlphanumeric(200);
        String pass = RandomStringUtils.randomAlphanumeric(10);
        registerSteps.enterNewUserCredentials(email+"@mailinator.com", pass);
        registerSteps.clickregisterButton();
        registerSteps.verifyInvalidLoginMessage();
    }

    @Test
    public void registerwithUnlimitedPassCrct() {
        registerSteps.navigateToLogin_RegisterPage();
        String email = RandomStringUtils.randomAlphanumeric(10);
        String pass = RandomStringUtils.randomAlphanumeric(200);
        registerSteps.enterNewUserCredentials(email+"@mailinator.com", pass);
        registerSteps.clickregisterButton();
        registerSteps.verifyRegisterMessage(email);
    }

    @Test
    public void registerwithUsedEmail() {
        registerSteps.navigateToLogin_RegisterPage();
        String pass = RandomStringUtils.randomAlphanumeric(10);
        registerSteps.enterNewUserCredentials(EnvConstants.USER_NAME+"@mailinator.com", pass);
        registerSteps.clickregisterButton();
        registerSteps.verifyUserExists();
    }

    @Test
    public void registerwithEmptyFields() {
        registerSteps.navigateToLogin_RegisterPage();
        registerSteps.clickregisterButton();
        registerSteps.verifyEmptyField();
    }
}

