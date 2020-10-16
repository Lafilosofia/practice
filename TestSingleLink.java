package com.tencent;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestSingleLink {
    public static void main(String[] args) {
        SingleLink singleLink = new SingleLink();
//        singleLink.insertTail("第一个节点");
//        singleLink.insertTail("第二个节点");
//        singleLink.insertTail("第三个节点");//NULL
        singleLink.insertHead("第一个节点");
        singleLink.insertHead("第二个节点");
        singleLink.insertHead("第三个节点");
        singleLink.show();
        List<String> list = new ArrayList();
        String a ;
        StringBuffer sb;
        StringBuilder stringBuilder;
        new HashMap<>();
        new LinkedHashMap<>();
        new ConcurrentHashMap<>();

    }
}
