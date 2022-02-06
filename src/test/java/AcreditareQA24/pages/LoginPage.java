package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class LoginPage extends BasePage{

    @FindBy(id = "username")
    private WebElementFacade usernameField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(id = "reg_email")
    private WebElementFacade registerUserEmail;

    @FindBy(id = "reg_password")
    private WebElementFacade registerUserPassword;

    @FindBy(css = ".u-column1 .woocommerce-Button")
    private WebElementFacade loginbutton;

    @FindBy(css = ".u-column2 .woocommerce-Button")
    private WebElementFacade registerButton;

    public void setUsernameField(String username){
        typeInto(usernameField, username);
    }

    public void setPassField(String password){
        clickOn(passField);
        typeInto(passField, password);
    }

    public void clickLogin(){
        clickOn(loginbutton);
    }

    public void clickRegisterButton() {
        waitFor(registerButton);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(registerButton);
        clickOn(registerButton);
    }

    public void setRegisterUserEmail(String email) {
        clickOn(registerUserEmail);
        typeInto(registerUserEmail, email);
    }

    public void setRegisterUserPassword(String password) {
        clickOn(registerUserPassword);
        typeInto(registerUserPassword, password);


    }
}
