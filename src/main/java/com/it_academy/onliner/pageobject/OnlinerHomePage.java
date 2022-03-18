package com.it_academy.onliner.pageobject;

import com.it_academy.onliner.framework.BasePage;
import org.openqa.selenium.By;

public class OnlinerHomePage extends BasePage {
    private static final By TILES_OUTER_COMPONENT =
        By.xpath("//*[contains(@class, 'b-tiles-outer')]");
    private static final By CATALOG_LINK =
        By.xpath("//a[contains(@href, 'catalog.onliner.by')]");
    
    public boolean isElementDisplayed() {
        return isElementDisplayed(TILES_OUTER_COMPONENT);
    }

    public CatalogPage clickOnCatalogLink() {
        waitForElementVisible(CATALOG_LINK).click();
        return new CatalogPage();
    }
}
