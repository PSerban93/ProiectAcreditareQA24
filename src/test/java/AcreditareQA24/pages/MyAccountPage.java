package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import java.time.Duration;

public class MyAccountPage extends BasePage {

        @FindBy(css = ".woocommerce-MyAccount-content p")
        private WebElementFacade loginMessage;

        @FindBy(css = ".woocommerce-MyAccount-content :nth-child(3)")
        private WebElementFacade logOutButton;

        @FindBy(css = ".woocommerce-MyAccount-content p")
        private WebElementFacade registerMessage;

        @FindBy(css = ".woocommerce-MyAccount-content p")
        private WebElementFacade successfulLoginMessage;

        @FindBy (css = ".woocommerce-error li ")
        private WebElementFacade alreadyExistingUserMessage;

        @FindBy (css = ".woocommerce-error li ")
        private WebElementFacade invalidUsernameMessage;

        @FindBy (css = ".woocommerce-error ")
        private WebElementFacade invalidLoginMessage;

        @FindBy (css = ".woocommerce-error li ")
        private WebElementFacade invalidPasswordMessage;

        @FindBy (css = ".woocommerce-error li ")
        private WebElementFacade usernameNotFound;

        @FindBy (css = ".woocommerce-error li")
        private WebElementFacade emptyPassFields;

        public void checkLogin(String username) {
        waitFor(loginMessage);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(loginMessage);
        loginMessage.shouldContainOnlyText("Hello " + username + " (not " + username + "? Log out)");
    }

        public void clickLogOutButton(){
            clickOn(logOutButton);
        }

        public void verifyEmptyFields(){
            usernameNotFound.shouldContainText(" Username is required.");
        }

        public void verifyInvalidPassword(String username) {
            invalidPasswordMessage.shouldContainText("password you entered for the username " + username +" is incorrect");
        }

        public void verifyInvalidUsername() {
            invalidUsernameMessage.shouldContainText("Invalid username");
        }

        public void verifyInvalidLoginMessage(){
            invalidLoginMessage.shouldContainOnlyText("Error: Error: Couldn’t register you… please contact us if you continue to have problems.");
        }
        public void verifyEmptyRegisterField() {
            invalidUsernameMessage.shouldContainText("Please provide a valid email address.");
        }

        public void verifyRegisterMessage(String email) {
            waitFor(registerMessage);
            withTimeoutOf(Duration.ofSeconds(10)).waitFor(registerMessage);
            registerMessage.shouldContainText("Hello " + email + " (not " + email + "? Log out)");
        }

        public void existingUserMessage() {
            alreadyExistingUserMessage.shouldContainText(("Error: An account is already registered with your email address. Please log in."));
        }

        public void verifyEmptyPassFields() {
            emptyPassFields.shouldContainOnlyText("ERROR: The password field is empty.");
        }

    }

