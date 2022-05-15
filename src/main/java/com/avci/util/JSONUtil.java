package com.avci.util;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class JSONUtil {

    public String convertStringToJSONObject(String text) {
        JSONObject jsonObject = new JSONObject(text);

        return jsonObject.toString();
    }
}
