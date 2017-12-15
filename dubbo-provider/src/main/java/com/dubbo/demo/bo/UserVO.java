package com.dubbo.demo.bo;

import java.util.Random;

public class UserVO {

    String name;

    int age;

    public UserVO(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
       if (o == this ) {
           return true;
       }
       if (o==null) {
           return false;
       }
       if (o.getClass() == this.getClass()) {
           UserVO v = (UserVO)o;
           return this.name.equals(v.name) && this.age == v.age;
       }
       return false;
    }

    @Override
    public int hashCode() {
        //int result = name != null ? name.hashCode() : 0;
        //result = 31 * result + age;
        //return result;
        return new Random().nextInt();
    }
}
