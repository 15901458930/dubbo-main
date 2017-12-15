package com.dubbo.demo.proxy.stati;



/**
 * 代理对象
 */
public class ProxyService {

    private RealService realService;

    public ProxyService(RealService realService){
        this.realService = realService;
    }

    public void sayHello(){
        System.out.println("c4 boom!!!");
        realService.sayHello();
    }

}
