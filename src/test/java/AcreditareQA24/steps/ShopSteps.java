package AcreditareQA24.steps;

import net.thucydides.core.annotations.Step;

public class ShopSteps extends BaseSteps{

    @Step
    public void clickOnShopButton() {
        homePage.clickOnShopButton();
    }
    @Step
    public void clickOnAddButton() {
        shopPage.clickOnAddButton();
    }
    @Step
    public void selectProduct() {
        shopPage.clickOnSelectedProduct();
    }

}
