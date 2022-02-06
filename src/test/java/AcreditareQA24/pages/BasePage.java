package AcreditareQA24.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {
    public int getIntFromPrice(String priceNonFormatted) {
        return Integer.parseInt(priceNonFormatted
                .replace(",", "")
                .replace(" lei", "")
                .replace(".", ""));
    }

}
