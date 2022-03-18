package com.it_academy.onliner.rest_api.utils;

import static io.restassured.RestAssured.given;

import io.restassured.response.ResponseBody;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class GetRequestUtils {
    private static final Logger LOG = LoggerFactory.getLogger(GetRequestUtils.class);

    private GetRequestUtils() {
    }

    public static ResponseBody makeRequestAndGetResponseBody(String endpoint, Map<String, Object> headers,
                                                      Map<String, Object> params) {
        return given()
                .headers(MapUtils.emptyIfNull(headers))
                .params(MapUtils.emptyIfNull(params))
                .when()
                .get(endpoint)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .getBody();
    }
}
