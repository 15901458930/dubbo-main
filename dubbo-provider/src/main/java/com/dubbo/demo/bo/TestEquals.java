package com.dubbo.demo.bo;

import java.util.*;
import java.util.Map;

public class TestEquals {


    public static void main(String[] args) {

        UserVO user1 = new UserVO("wangpeng",12);

        UserVO user2 = new UserVO("wangpeng",12);
        Map amp = new HashMap();
        System.out.println(user1.equals(user2));


        Set<UserVO> s = new HashSet<UserVO>();

        s.add(user1);
        s.add(user2);
        System.out.println(s.size());

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }
}
