package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends BasePage{

    @FindBy(css=".page-title")
    private WebElementFacade searchTitle;

    @FindBy(css = ".site-main .entry-title")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = ".content-area .product")
    private List<WebElementFacade> productList;

    public void verifySearchTitle(String value) {
        if (searchTitle.containsText("NOTHING FOUND")) {
            System.out.println("No product found");
        }
        else if (searchTitle.containsText(value));{
        }
    }

    public boolean openProduct(String name){
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".entry-title a")).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("a")).click();
                return true;
            }
        }
        return false;
    }

    public boolean isProductDisplayed(String productName){
        for(WebElementFacade webElementFacade:productList){
            if (webElementFacade.findElement(By.cssSelector(".entry-title a")).getText().toLowerCase().contains(productName.toLowerCase()))
                return true;
        }
        return false;
    }

}
