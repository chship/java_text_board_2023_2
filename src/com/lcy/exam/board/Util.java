package com.lcy.exam.board;
import java.util.HashMap;
import java.util.Map;
class Util {
    static Map<String, String> getParamsFromUrl(String url) {
        Map<String, String> params = new HashMap<>();
        String[] urlBits = url.split("\\?", 2);

        if (urlBits.length == 1) {
            return params;
        }

        for (String bit : urlBits[1].split("&")) {
            String[] bitBits = bit.split("=", 2);
            if (bitBits.length == 1) {
                continue;
            }
            params.put(bitBits[0], bitBits[1]);
        }

        return params;
    }

    static String getUrlPathFromUrl(String url) {
        return url.split("\\?", 2)[0];
    }
}