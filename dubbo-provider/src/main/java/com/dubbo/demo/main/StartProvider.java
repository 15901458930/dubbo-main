package com.dubbo.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartProvider {


    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        content.start();
        System.in.read();
    }
}
