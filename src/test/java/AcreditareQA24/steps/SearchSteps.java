package AcreditareQA24.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForProduct(String product) {
        homePage.clickOnSearchIcon();
        homePage.setsearchField(product);
        homePage.clickOnSearchButton();

    }
    @Step
    public  void verifySearchResult(String product) {
        searchResultsPage.verifySearchTitle("Search Results for: "+product);
    }

    @Step
    public void searchForProductNotFound(String product) {
        homePage.clickOnSearchIcon();
        homePage.setsearchField(product);
        homePage.clickOnSearchButton();
    }

    @Step
    public void verifyInvalidSearchTests() {
        searchResultsPage.verifySearchTitle("NOTHING FOUND");
    }

    @Step
    public void findAndOpenProduct(String productName) {
        Assert.assertTrue(searchResultsPage.openProduct(productName));
    }

    @Step
    public void verifyProductisDisplayed(String productName) {
        Assert.assertTrue(searchResultsPage.isProductDisplayed(productName));
    }
}
