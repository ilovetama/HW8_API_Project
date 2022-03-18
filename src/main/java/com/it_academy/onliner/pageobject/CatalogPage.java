package com.it_academy.onliner.pageobject;

import static java.lang.String.format;

import com.it_academy.onliner.framework.BasePage;
import org.openqa.selenium.By;

public class CatalogPage extends BasePage {

    private static final String CATALOG_CLASSIFIER_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'catalog-navigation-classifier__item')]//*[contains(text(), '%s')]";
    private static final String CATALOG_CLASSIFIER_CATEGORY_XPATH_PATTERN =
            "//*[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
    private static final String PRODUCT_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'item_active')]//a[.//*[contains(text(), '%s')]]";

    public CatalogPage clickOnCatalogClassifierLink(String link) {
        waitForElementVisible(By.xpath(format(CATALOG_CLASSIFIER_LINK_XPATH_PATTERN, link))).click();
        return this;
    }

    public CatalogPage selectCategory(String category) {
        waitForElementVisible(By.xpath(format(CATALOG_CLASSIFIER_CATEGORY_XPATH_PATTERN, category))).click();
        return this;
    }

    public ProductPage selectProduct(String product) {
        waitForElementVisible(By.xpath(format(PRODUCT_LINK_XPATH_PATTERN, product))).click();
        return new ProductPage();
    }
}
