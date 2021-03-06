package com.dubboServer.vo.res;

import java.io.Serializable;

/**
 * Created by xuliangxiao on 2017/6/12 17:52
 */
public class UserRes  implements Serializable {
    private String name;
    private int age;

    public UserRes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserRes{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
