package AcreditareQA24.steps;

import net.thucydides.core.annotations.Step;

public class BlogSteps extends BaseSteps{

    @Step
    public void clickOnBlogButton() {
        homePage.clickOnBlogButton();
    }

    @Step
    public void verifyErrorQuickMessage() {
        blogPage.checkQuickMsg();
    }

    @Step
    public void verifyErrorDuplicateMessage() {
        blogPage.checkDuplicateMsg();
    }

    @Step
    public void setComment(String text) {
        waitABit(1500);
        blogPage.typeComment(text);
        waitABit(1500);
    }

    @Step
    public void postComment() {
        waitABit(1500);
        blogPage.clickOnPostButton();
    }

    @Step
    public void verifyCommentIsPosted(String message) {
        blogPage.messageIsPosted(message);
    }

    @Step
    public void verifyErrorMessage() {
        blogPage.checkErrorMsg();
    }


}
