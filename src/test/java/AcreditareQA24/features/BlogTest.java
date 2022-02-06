package AcreditareQA24.features;

import AcreditareQA24.utils.EnvConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class BlogTest extends BaseTest{

    @Test
    public void addTestComment(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        blogSteps.clickOnBlogButton();
        blogSteps.setComment("This is a Simple Test Comment !!!");
        blogSteps.postComment();
        blogSteps.verifyCommentIsPosted("This is a Simple Test Comment !!!");
    }

    @Test
    public void checkMaxNrofCrctMsg(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        blogSteps.clickOnBlogButton();
        String message = RandomStringUtils.randomAlphanumeric(200);
        blogSteps.setComment(message);
        blogSteps.postComment();
        blogSteps.verifyCommentIsPosted(message);
    }

    @Test
    public void checkEmptyMsg(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        blogSteps.clickOnBlogButton();
        blogSteps.postComment();
        blogSteps.verifyErrorMessage();
    }

    @Test
    public void addCommentonProduct(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        searchSteps.searchForProduct("Beanie with Logo");
        searchSteps.verifySearchResult("Beanie with Logo");
        searchSteps.verifyProductisDisplayed("Beanie with Logo");
        searchSteps.findAndOpenProduct("Beanie with Logo");
        productSteps.clickReviewsbutton();
        productSteps.addCommentonProduct("Best Product!! Thank you very much. The Product is just what I am looking for this frosty weather !!");
        productSteps.starRating5();
        productSteps.clickSubmitComment();
        productSteps.checkApproval();
        productSteps.checkComment("Best Product!! Thank you very much. The Product is just what I am looking for this frosty weather !!");
    }

    @Test
    public void commentonOutofStockProduct(){
        loginSteps.doLogin(EnvConstants.USER_NAME,EnvConstants.USER_PASS);
        searchSteps.searchForProduct("Album");
        searchSteps.verifySearchResult("Album");
        searchSteps.verifyProductisDisplayed("Album");
        searchSteps.findAndOpenProduct("Album");
        productSteps.clickReviewsbutton();
        productSteps.addCommentonProduct("When is Coming back on Stock ??");
        productSteps.starRating3();
        productSteps.clickSubmitComment();
        productSteps.checkApproval();
        productSteps.checkComment("When is Coming back on Stock ??");
    }
}
