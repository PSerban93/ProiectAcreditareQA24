package AcreditareQA24.features;

import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchProduct(){
        searchSteps.searchForProduct("abc");
        searchSteps.verifySearchResult("abc");
        searchSteps.verifyProductisDisplayed("abc");
        searchSteps.findAndOpenProduct("abc");
    }

    @Test
    public void searchProductnotFound(){
        searchSteps.searchForProductNotFound("Playstation");
        searchSteps.verifySearchResult("Playstation");

    }

    @Test
    public void searchProductFound(){
        searchSteps.searchForProduct("Cap");
        searchSteps.verifySearchResult("Cap");
        searchSteps.verifyProductisDisplayed("Cap");
    }
}
