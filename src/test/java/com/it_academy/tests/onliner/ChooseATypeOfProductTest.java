package com.it_academy.tests.onliner;

import static com.it_academy.onliner.pageobject.ProductPage.REGEX;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import com.it_academy.onliner.rest_api.service.SushiVeslaService;
import java.util.List;
import org.testng.annotations.Test;

public class ChooseATypeOfProductTest extends BaseTest{

  @Test
  public void testUserIsAbleToChooseATypeOfProduct() {
    SushiVeslaService sushiVeslaService = new SushiVeslaService();
    List<String> typesOfProduct = sushiVeslaService.getNameOfChoosenProductType();
    typesOfProduct.forEach(System.out::println);
    List<String> distinctType = typesOfProduct
        .stream()
        .distinct()
        .toList();
    distinctType.forEach(System.out::println);
    assertThat(distinctType)
        .as("Name_prefix don`t contains regex")
        .isEqualTo(REGEX);
  }

}
