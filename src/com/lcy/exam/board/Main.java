package com.lcy.exam.board;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Rq rq = new Rq("/usr/article/list?page=2&searchKeyword=안녕? 나는 홍길동이야.");

        Map<String, String> params = rq.getParams();
        System.out.println(params); // 출력 : {page=2, searchKeyword=안녕? 나는 홍길동이야.}

        String urlPath = rq.getUrlPath();
        System.out.println(urlPath); // 출력 : /usr/article/list
    }
}