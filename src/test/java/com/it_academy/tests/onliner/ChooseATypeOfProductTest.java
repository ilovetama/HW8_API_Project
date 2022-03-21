package com.it_academy.tests.onliner;

import static org.assertj.core.api.Assertions.assertThat;

import com.it_academy.onliner.rest_api.service.SushiVeslaService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;

public class ChooseATypeOfProductTest extends BaseTest {

  @Test
  public void testUserIsAbleToChooseATypeOfProduct() {
    SushiVeslaService sushiVeslaService = new SushiVeslaService();
    List<String> typesOfProducts = sushiVeslaService.getNameOfChoosenProductType();
    Set<String> set = new LinkedHashSet<>(typesOfProducts);
    assertThat(typesOfProducts)
        .as("Name_prefix does not contains type of product")
        .allMatch(element -> element.contains("Роллы"));
  }
}
