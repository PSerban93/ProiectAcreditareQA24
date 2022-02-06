package AcreditareQA24.steps;

import net.thucydides.core.annotations.Step;

public class ProductSteps extends BaseSteps {

    @Step
    public void outofStock() {
        productPage.outofStock();
    }

    @Step
    public void clickAddtoCart() {
        productPage.clickAddtoCart();
    }

    @Step
    public void verifyAddedToCart(String product) {
        productPage.verifyProductIsAdded(product);
    }

    @Step
    public void clickViewCartButton() {
        productPage.clickCartButton();
    }

    @Step
    public void clickReviewsbutton(){
        productPage.clickReviewsbutton();
    }

    @Step
    public void setComment(String Comment){
        productPage.setComment(Comment);
    }

    @Step
    public void clickSubmitComment(){
        productPage.clickSubmitComment();
    }

    @Step
    public void addCommentonProduct(String Comment){
        clickReviewsbutton();
        waitABit(1500);
        setComment(Comment);
        waitABit(1500);

    }

    @Step
    public void starRating1(){
        productPage.clickStarRating1();
    }

    @Step
    public void starRating2(){
        productPage.clickStarRating2();
    }

    @Step
    public void starRating3(){
        productPage.clickStarRating3();
    }

    @Step
    public void starRating4(){
        productPage.clickStarRating4();
    }

    @Step
    public void starRating5(){
        productPage.clickStarRating5();
    }

    @Step
    public void checkApproval(){
        productPage.checkApprovalComment();
    }

    @Step
    public void checkComment(String Comment){
        productPage.checkCommentList(Comment);
    }

    @Step
    public void setFirstCollectionProductQty(String qty){
        productPage.setFirstCollectionProductQty(qty);
    }

    @Step
    public void setSecondCollectionProductQty(String qty){
        productPage.setSecondCollectionProductQty(qty);
    }

    @Step
    public void setThirdCollectionProductQty(String qty){
        productPage.setThirdCollectionProductQty(qty);
    }
}
