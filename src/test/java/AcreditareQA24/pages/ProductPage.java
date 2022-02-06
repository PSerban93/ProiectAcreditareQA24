package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

public class ProductPage extends BasePage {


    @FindBy(css = ".cart .button")
    private WebElementFacade addtoCart;

    @FindBy(css = ".out-of-stock")
    private WebElementFacade outofStocktext;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade addedToCartMessage;

    @FindBy(css = ".wc-forward")
    private WebElementFacade productCartButton;

    @FindBy(css = ".reviews_tab a")
    private WebElementFacade reviewsTab;

    @FindBy(id = "comment")
    private WebElementFacade commentField;

    @FindBy(id = "submit")
    private WebElementFacade submitComment;

    @FindBy(css = ".stars .star-1")
    private WebElementFacade starRating1;

    @FindBy(css = ".stars .star-2")
    private WebElementFacade starRating2;

    @FindBy(css = ".stars .star-3")
    private WebElementFacade starRating3;

    @FindBy(css = ".stars .star-4")
    private WebElementFacade starRating4;

    @FindBy(css = ".stars .star-5")
    private WebElementFacade starRating5;

    @FindBy(css = ".commentlist li")
    private List<WebElementFacade> checkApprovalComment;

    @FindBy(css = ".commentlist li")
    private List<WebElementFacade> checkCommentList;

    @FindBy(css = ".group_table .post-46 input")
    private WebElementFacade firstCollectionProduct;

    @FindBy(css = ".group_table .post-47 input")
    private WebElementFacade secondCollectionProduct;

    @FindBy(css = ".group_table .post-48 input")
    private WebElementFacade thirdCollectionProduct;

    public void outofStock() {
        outofStocktext.shouldContainOnlyText("Out of stock");
    }

    public void clickAddtoCart() {
        if (outofStocktext.isPresent())
            outofStocktext.shouldBePresent();
        if (addtoCart.isPresent()) {
            addtoCart.click();
        }
    }

    public void verifyProductIsAdded(String product) {
        if (outofStocktext.isPresent())
            if (addedToCartMessage.isPresent()) {
                waitFor(addedToCartMessage);
                withTimeoutOf(Duration.ofSeconds(10)).waitFor(addedToCartMessage);
                addedToCartMessage.shouldContainText('“' + product + '”' + " has been added to your cart.");
            }
    }

    public void clickCartButton() {
        waitFor(productCartButton);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(productCartButton);
        clickOn(productCartButton);
    }

    public void clickReviewsbutton() {
        clickOn(reviewsTab);
    }

    public void setComment(String Comment) {
        typeInto(commentField, Comment);
    }

    public void clickSubmitComment() {
        clickOn(submitComment);
    }

    public void clickStarRating1() {
        clickOn(starRating1);
    }

    public void clickStarRating2() {
        clickOn(starRating2);
    }

    public void clickStarRating3() {
        clickOn(starRating3);
    }

    public void clickStarRating4() {
        clickOn(starRating4);
    }

    public void clickStarRating5() {
        clickOn(starRating5);
    }

    public boolean checkApprovalComment() {
        waitFor(checkApprovalComment.get(0));
        for (WebElementFacade element : checkApprovalComment) {
            if (element.findElement(By.cssSelector(".meta em")).getText().equalsIgnoreCase("Your review is awaiting approval")) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCommentList(String Comment) {
        waitFor(checkCommentList.get(0));
        for (WebElementFacade element : checkCommentList) {
            if (element.findElement(By.cssSelector(".description")).getText().equalsIgnoreCase(Comment)) {
                return true;
            }
        }
        return false;
    }

    public void setFirstCollectionProductQty(String qty){
        firstCollectionProduct.clear();
        typeInto(firstCollectionProduct, qty);
    }

    public void setSecondCollectionProductQty(String qty){
        typeInto(secondCollectionProduct, qty);
    }

    public void setThirdCollectionProductQty(String qty){
        typeInto(thirdCollectionProduct, qty);
    }


}








