package com.lcy.exam.board;
import java.util.HashMap;
import java.util.Map;
class Rq {
    String url;

    Rq(String url) {
        this.url = url;
    }

    Map<String, String> getParams() {
        // 원재료 => ?  뒷부분을 자르고, & 기준으로 자르고, = 기준으로 잘라서
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

    String getUrlPath() {
        return url.split("\\?", 2)[0];
    }