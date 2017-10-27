package com.dubbo.demo.consumer.main;

import com.dubbo.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        System.out.println("spring容器启动。。。");
        DemoService ds  = (DemoService) c.getBean("demoService");
        System.out.println("获取ds:::"+ds);
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");
        ds.sayHello("hehe");




    }
}
