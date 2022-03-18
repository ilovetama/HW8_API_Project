package com.it_academy.onliner.rest_api.service;

import com.it_academy.onliner.rest_api.model.SushiVeslaFacet;
import com.it_academy.onliner.rest_api.utils.GetRequestUtils;
import com.it_academy.onliner.rest_api.utils.ResponseBodyUtils;
import io.restassured.response.ResponseBody;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SushiVeslaService {

    private static final Logger LOG = LoggerFactory.getLogger(SushiVeslaService.class);

    public List<SushiVeslaFacet> getSushiVeslaFacetItems() {
        String endpoint = "https://catalog.onliner.by/sdapi/catalog.api/search/sushivesla";
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(endpoint, null, null);
        //LOG.info("Response body: {}", responseBody.asString());
        return ResponseBodyUtils.getObjectsByJsonPath(responseBody, "products",
                SushiVeslaFacet.class);
    }

    public List<String> getNameOfChoosenProductType() {
        String endpoint = "https://catalog.onliner.by/sdapi/catalog.api/search/"
            + "sushivesla?sushi_typ[0]=roll&sushi_typ[operation]=union";
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(endpoint, null, null);
        //LOG.info("Response body: {}", responseBody.asString());
        return Collections.singletonList(
            ResponseBodyUtils.getStringJsonValue(responseBody, "products.name_prefix"));
    }

    private Map<String, Object> configureRequestHeaders() {
        return Map.of("", "",
                "", "",
                "", "",
                "", "",
                "", "");
    }
}
