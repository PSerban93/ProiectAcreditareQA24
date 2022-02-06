package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlogPage extends BasePage {
    @FindBy(css = "#comment[name=\"comment\"]")
    public WebElementFacade commentField;

    @FindBy(css = ".form-submit #submit")
    public WebElementFacade postButton;

    @FindBy(css = ".comment-list li:last-child .comment-content p")
    public WebElementFacade lastCommentText;

    @FindBy(css = "#error-page p:nth-child(2)")
    public WebElementFacade errorMessage;

    @FindBy(css = "#error-page p:nth-child(2)")
    public WebElementFacade errorQuickMessage;

    @FindBy(css = "#error-page p:nth-child(2)")
    public WebElementFacade errorDuplicateMessage;

    public void clickOnPostButton() {
        clickOn(postButton);
    }

    public void typeComment(String text) {
        typeInto(commentField, text);
    }

    public void checkErrorMsg() {
        errorMessage.shouldContainOnlyText("ERROR: please type a comment.");
    }

    public void checkQuickMsg() {
        errorQuickMessage.shouldContainOnlyText("You are posting comments too quickly. Slow down.");
    }

    public void checkDuplicateMsg() {
        errorQuickMessage.shouldContainOnlyText("Duplicate comment detected; it looks as though you’ve already said that!");
    }

    public void messageIsPosted(String message) {
        lastCommentText.shouldContainText(message);
        if (errorQuickMessage.isPresent()) {
            errorQuickMessage.shouldBePresent();
            if (errorDuplicateMessage.isPresent()) {
                errorDuplicateMessage.shouldBePresent();
            }
        }
    }
}