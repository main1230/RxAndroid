package com.zzl.cn.bean;

import java.io.Serializable;

/**
 * Created by: zzl.
 * describe:
 * date: 2016/6/30.
 */
public class UserBean implements Serializable {
    private String name;
    private int age;
    private String sex;
    private String password;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
