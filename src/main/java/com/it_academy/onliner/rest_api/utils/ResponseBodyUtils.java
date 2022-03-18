package com.it_academy.onliner.rest_api.utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ResponseBodyUtils {
    private static final Logger LOG = LoggerFactory.getLogger(ResponseBodyUtils.class);

    private ResponseBodyUtils() {
    }

    public static <T> List<T> getObjectsByJsonPath(ResponseBody responseBody, String jsonPath,
                                                   Class<T> genericType) {
        return responseBody
                .jsonPath()
                .getList(jsonPath, genericType);
    }

    public static <T> T getObjectByJsonPath(ResponseBody responseBody, String jsonPath,
                                            Class<T> genericType) {
        return responseBody
                .jsonPath()
                .getObject(jsonPath, genericType);
    }

    public static String getStringJsonValue(ResponseBody responseBody, String jsonPath) {
        return JsonPath.from(responseBody.asString()).getString(jsonPath);
    }
}
