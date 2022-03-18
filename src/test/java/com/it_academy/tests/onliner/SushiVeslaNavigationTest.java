package com.it_academy.tests.onliner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import com.it_academy.onliner.navigation.OnlinerNavigation;
import com.it_academy.onliner.pageobject.OnlinerHeader;
import com.it_academy.onliner.rest_api.model.SushiVeslaFacet;
import com.it_academy.onliner.rest_api.service.SushiVeslaService;
import java.util.Collection;
import java.util.List;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SushiVeslaNavigationTest extends BaseTest {

  private final OnlinerHeader onlinerHeader = new OnlinerHeader();

  @BeforeClass
  public void navigateToOnliner() {
    OnlinerNavigation.navigateToOnlinerHomePage();
  }

  @Test
  public void testUserIsAbleToNavigateToProductPageViaCatalog() {
    Collection<String> ProductName = onlinerHeader
        .clickOnCatalogNavigationLink()
        .clickOnCatalogClassifierLink("Еда")
        .selectCategory("Суши")
        .selectProduct("Суши Весла")
        .getProductName();
    assertThat(ProductName)
        .as("Product name is not displayed")
        .isNotEmpty();

    SushiVeslaService sushiVeslaService = new SushiVeslaService();
    List<SushiVeslaFacet> sushiVeslaFacets = sushiVeslaService.getSushiVeslaFacetItems();
    sushiVeslaFacets.forEach(System.out::println);
  }

  @AfterClass
  public void closeBrowser() {
    onlinerHeader.closeBrowser();
  }
}
