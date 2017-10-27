package com.dubbo.demo.provider;

import com.dubbo.demo.api.DemoService;

public class DemoServiceImpl implements DemoService{


    public void sayHello(String name) {
        System.out.println("hello world!!");
    }
}


