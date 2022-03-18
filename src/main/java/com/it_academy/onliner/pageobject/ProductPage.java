package com.it_academy.onliner.pageobject;

import com.it_academy.onliner.framework.BasePage;
import java.util.Collection;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private static final String PRODUCT_NAME =
        "//a[contains(@class, 'product-title-link')]"
            + "/*[contains(@data-bind, 'product.full_name')]";
    public static final String REGEX = "Роллы";

    public Collection<String> getProductName() {
        return getTextsFromWebElements(waitForElementsVisible(By.xpath(PRODUCT_NAME)));
    }

}
