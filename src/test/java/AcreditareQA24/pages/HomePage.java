package AcreditareQA24.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

    @FindBy(css = ".site-header-right-link [title=Login]")
    private WebElementFacade loginLink;

    @FindBy(css = ".site-header-right-link [title=Login]")
    private WebElementFacade registerLink;

    @FindBy(css = ".fa-search")
    private WebElementFacade searchIcon;

    @FindBy(css = ".search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".search-submit")
    private WebElementFacade searchButton;

    @FindBy(css = "#menu-item-1728")
    private  WebElementFacade shopButton;

    @FindBy(css = "#menu-item-1643")
    private WebElementFacade blogButton;

    @FindBy(css=".fa-shopping-cart")
    private WebElementFacade cartButton;

    @FindBy(css = "#menu-item-1729")
    private WebElementFacade checkoutButton;

    @FindBy(id = "menu-item-1730")
    private WebElementFacade myAccountButton;

    public void clickLoginLink(){
        clickOn(loginLink);
    }

    public void clickRegisterLink(){
        clickOn(registerLink);
    }

    public void clickOnSearchIcon() {
        clickOn(searchIcon);
    }

    public void setsearchField(String value) {
        typeInto(searchField, value);
    }

    public void clickOnSearchButton() {
        clickOn(searchButton);
    }

    public void  clickOnShopButton() {
        clickOn(shopButton);
    }

    public void clickOnBlogButton(){
        clickOn(blogButton);
    }

    public void clickOnCartButton() {
        clickOn(cartButton);
    }

    public void clickOnCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void clickOnMyAccountButton(){
        clickOn(myAccountButton);
    }
}
